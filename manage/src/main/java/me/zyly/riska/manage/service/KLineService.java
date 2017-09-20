package me.zyly.riska.manage.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import lombok.Data;
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
import java.util.ArrayList;
import java.util.List;

@Service
public class KLineService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KLineService.class);
    private static final String MARKET_COLLECTION_NAME = "marketData";
    private static final String LAST_PRICE_FIELD_NAME = "lastPriceInt";
    private @Autowired MongoTemplate mongoTemplate;

    /**
     * 获取等价K线记录
     * @param instrument 行情ID
     * @param start 开始日期 format:yyyyMMdd
     * @param end 结束日期 format:yyyyMMdd
     * @param rate 范围比例
     * @return 等价行情数据
     */
    public Md equivalenceLine(String instrument, long start, long end, double rate) {
        DBCollection collection = mongoTemplate.getCollection(MARKET_COLLECTION_NAME);
        Query query = Query.query(Criteria.where("instrument").is(instrument).and("tradeTimestamp")
                .gte(start).lt(end)).with(new Sort(Sort.Direction.ASC, "tradeTimestamp"));
        LOGGER.info("query : {}", query);
        List<SingleMarketData> data = new ArrayList<>();

        try (DBCursor cursor = collection.find(query.getQueryObject()).sort(query.getSortObject())) {
            LOGGER.debug("ready to process data count: {}", cursor.count());
            if(cursor.hasNext()) {
                BasicDBObject line = (BasicDBObject)cursor.next();
                SingleMarketData openPriceData = castToMd(line, "openPriceInt");
                data.add(openPriceData);
            }
            Scope scope = new Scope.Algorithm.IC().calculate(rate, data.get(0).getOpen());
            LOGGER.debug("first data: {}", data.get(0));
            LOGGER.debug("first scope: {}", scope);
            while (cursor.hasNext()) {
                BasicDBObject line = (BasicDBObject)cursor.next();
                SingleMarketData current = castToMd(line, LAST_PRICE_FIELD_NAME);
                compareForEquivalence(current, data, scope);
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
                if(current.getOpen() < scope.getMin() || (current.getOpen() > scope.getMax())) {
                    int offset = Math.abs(current.getOpen() - parent.getOpen()) / scope.getRange() * scope.getRange() + parent.getOpen();
                    int oldmin = scope.getMin(), oldmax = scope.getMax();
                    scope.setOffset(offset);
                    scope.setMin(offset - scope.getRange());
                    scope.setMax(offset + scope.getRange());
                    LOGGER.debug("------------------------------------------------------------------");
                    LOGGER.debug("parent: {}, current: {}, oldmin: {}, oldmax:{}",
                            parent.getOpen(), current.getOpen(), oldmin, oldmax);
                    LOGGER.debug("new center: {}, range:{}, newmin: {}, newmax: {}",
                            offset, scope.getRange(), scope.getMin(), scope.getMax());
                    LOGGER.debug("------------------------------------------------------------------");
                    data.add(current);

                }else {
                    parent.setClose(current.getOpen());
                    if(current.getOpen() > parent.getHighest()) {
                        parent.setHighest(current.getOpen());
                    }else if(current.getOpen() < parent.getLowest()) {
                        parent.setLowest(current.getOpen());
                    }
                }
            }
        }
        return scope;
    }
//else if(Math.abs(current.getOpen() - parent.getOpen()) == scope.getRange()){
//        // equals
//        LOGGER.info("new k line by equals current: {}, parent: {}, range: {}, min: {}, max: {}", current.getOpen(),
//                parent.getOpen(), scope.getRange(), scope.getMin(), scope.getMax());
//        parent.setClose(current.getOpen());
//        scope.setForceAdd(true);
//        return scope;
//    }
    private SingleMarketData castToMd(BasicDBObject line, String priceFieldName) {
        String label = line.getString("tradingDay");
        SingleMarketData singleMarketData = new SingleMarketData(label, line.getInt(priceFieldName));
        singleMarketData.setTradingDay(line.getInt("tradingDay"));
        return singleMarketData;
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
