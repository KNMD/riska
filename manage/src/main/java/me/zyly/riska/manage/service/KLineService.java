package me.zyly.riska.manage.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import lombok.Data;
import me.zyly.riska.core.domain.InstrumentInfo;
import me.zyly.riska.core.repository.InstrumentInfoRepository;
import me.zyly.riska.manage.domain.Scope;
import me.zyly.riska.manage.domain.SingleMarketData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class KLineService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KLineService.class);
    private static final String MARKET_COLLECTION_NAME = "marketData";
    private static final String LAST_PRICE_FIELD_NAME = "lastPriceInt";
    private @Autowired MongoTemplate mongoTemplate;
    private @Autowired InstrumentInfoRepository instrumentInfoRepository;

    private Map<String, Integer> makeOffsetMap() {
        Iterable<InstrumentInfo> offsetList = instrumentInfoRepository.findAll();
        Map<String, Integer> map = new HashMap<>();
        offsetList.forEach(instrumentInfo ->
            map.put(instrumentInfo.getType() + instrumentInfo.getDay(), instrumentInfo.getCumOffset())
        );
        return map;
    }

    /**
     * 获取等价K线记录
     * @param instrument 行情ID
     * @param start 开始日期 format:yyyyMMdd
     * @param end 结束日期 format:yyyyMMdd
     * @param rate 范围比例
     * @return 等价行情数据
     */
    public Md equivalenceLine(String instrument, long start, long end, double rate) {
        Map<String, Integer> offsetMap = makeOffsetMap();
        DBCollection collection = mongoTemplate.getCollection(MARKET_COLLECTION_NAME);
        Query query = Query.query(Criteria.where("instrument").is(instrument).and("tradeTimestamp")
                .gte(start).lt(end)).with(new Sort(Sort.Direction.ASC, "tradeTimestamp"));
        LOGGER.info("query : {}", query);
        List<SingleMarketData> data = new ArrayList<>();

        try (DBCursor cursor = collection.find(query.getQueryObject()).sort(query.getSortObject())) {
            LOGGER.debug("ready to process data count: {}", cursor.count());
            if(cursor.hasNext()) {
                BasicDBObject line = (BasicDBObject)cursor.next();
                SingleMarketData openPriceData = castToMd(line, "openPriceInt", offsetMap);
                data.add(openPriceData);
            }
            Scope scope = new Scope.Algorithm.IC().calculate(rate, data.get(0).getOpen());
            while (cursor.hasNext()) {
                BasicDBObject line = (BasicDBObject)cursor.next();
                SingleMarketData current = castToMd(line, LAST_PRICE_FIELD_NAME, offsetMap);
                scope = compareForEquivalence(current, data, scope);
            }
            LOGGER.debug("combine data count: {}", data.size());
            return new Md(
                    instrument,
                    data.get(0).getOpen(),
                    data,
                    scope
            );
        }
    }

    public Scope compareForEquivalence(SingleMarketData current, List<SingleMarketData> data, Scope scope) {
        SingleMarketData parent = data.get(data.size() - 1);
        if(current.getTradingDay() != parent.getTradingDay()) {
            data.add(current);
            scope = new Scope.Algorithm.IC().calculate(scope.getRate(), current.getOpen());
        }else {
            if(scope.isForceAdd()) {
                data.add(current);
                scope.setForceAdd(false);
            }else {
                int direction = current.getOpen() > parent.getOpen() ? 1 : 0;
                int offset = Math.abs(scope.getCenter() - current.getOpen()) - scope.getRange();
                if(offset < 0) {
                    parent.setClose(current.getOpen());
                    if (current.getOpen() > parent.getHighest()) {
                        parent.setHighest(current.getOpen());
                    } else if (current.getOpen() < parent.getLowest()) {
                        parent.setLowest(current.getOpen());
                    }
                }else {
                    if(current.getOpen() == scope.getMin() || current.getOpen() == scope.getMax()) {
                        parent.setClose(current.getOpen());
                        scope.setForceAdd(true);
                    }else {
                        data.add(current);
                        while(offset > scope.getRange()) {
                            int newPrice = direction == 1 ? current.getOpen() + scope.getRange() :
                                    current.getOpen() - scope.getRange();
                            current = createNewMD(newPrice, current);
                            data.add(current);
                            offset = offset - scope.getRange();
//                            jumpScope(scope, current.getOpen(), parent.getOpen(), direction);
                            scope.setCenter(direction == 1 ? scope.getCenter() + scope.getRange() :
                                    scope.getCenter() - scope.getRange());
                        }
                    }
                    jumpScope(scope, current.getOpen(), parent.getOpen(), direction);
                }
            }
        }
        return scope;
    }

    private SingleMarketData createNewMD(int newPrice, SingleMarketData current) {
        SingleMarketData singleMarketData = new SingleMarketData();
        singleMarketData.setLabel(current.getLabel());
        singleMarketData.setTradingDay(current.getTradingDay());
        singleMarketData.setTime(current.getTime());
        singleMarketData.setOpen(newPrice);
        singleMarketData.setClose(newPrice);
        singleMarketData.setHighest(newPrice);
        singleMarketData.setLowest(newPrice);
        return singleMarketData;
    }


    private void jumpScope(Scope scope, int currentPrice, int parentPrice, int direction) {
//        int before = scope.getCenter(), min = scope.getMin(), max = scope.getMax();

//                        LOGGER.debug("current before: {}, after: {}, min: {}, max: {}, current open: {}, label: {}",
//                                before, scope.getCenter(), min, max, current.getOpen(), current.getLabel());
        scope.setCenter(direction == 1 ? scope.getCenter() + scope.getRange() : scope.getCenter() - scope.getRange());
        scope.setMin(scope.getCenter() - scope.getRange());
        scope.setMax(scope.getCenter() + scope.getRange());
    }

    private SingleMarketData castToMd(BasicDBObject line, String priceFieldName, Map<String, Integer> offsetMap) {
        String label = line.getInt("tradingDay") + " " + line.getString("updateTime"),
            instrumentID = line.getString("instrumentID");
        Integer price = line.getInt(priceFieldName),
                offset = getMapValue(offsetMap, instrumentID);
        SingleMarketData singleMarketData = new SingleMarketData(label, price + offset);
        singleMarketData.setTradingDay(line.getInt("tradingDay"));
        return singleMarketData;
    }

    private Integer getMapValue(Map<String, Integer> map, String key) {
        Integer value = map.get(key);
        return null == value ? 0 : value;
    }

    @Data
    public static class Md {
        private int open;
        private String instrument;
        private Scope scope;
        private List<SingleMarketData> kLineData;
        Md(String instrument, int open, List<SingleMarketData> kLineData, Scope scope) {
            this.instrument = instrument;
            this.kLineData = kLineData;
            this.open = open;
            this.scope = scope;
        }
    }

}
