package me.zyly.riska.data.processor.runner;

import com.mongodb.WriteResult;
import me.zyly.riska.core.domain.MarketData;
import me.zyly.riska.core.repository.MarketDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class DataOffsetRunner implements CommandLineRunner{

    private static Logger LOGGER = LoggerFactory.getLogger(DataOffsetRunner.class);
    private @Autowired MarketDataRepository marketDataRepository;
    private @Autowired MongoTemplate mongoTemplate;
    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("start process data offset... ");
        int parentEndPrice = 0;
        for(int i = 1601; i <= 1612; i++) {
            MarketData currentEnd = marketDataRepository.
                    findOneByInstrumentInt(i, new Sort(Sort.Direction.DESC, "tradeTimestamp"));
            if(0 == parentEndPrice) {
                parentEndPrice = currentEnd.getLastPriceInt();
            }else {
                MarketData currentStart = marketDataRepository.
                        findOneByInstrumentInt(i, new Sort(Sort.Direction.ASC, "tradeTimestamp"));
                int offset = currentStart.getLastPriceInt() - parentEndPrice;
                LOGGER.info("inst: {}, parentEndPrice: {}, currentStartPrice: {}, offset: {},",
                        i, parentEndPrice, currentStart.getLastPriceInt(), offset);
                WriteResult result = mongoTemplate.updateMulti(
                        Query.query(Criteria.where("instrumentInt").lt(i)),
                        new Update().inc("lastPriceOffsetInt", offset), MarketData.class);
                LOGGER.info("result: {}", result);
                LOGGER.info("update 合约 < {}, offsetPrice: {}", i, offset);
                parentEndPrice = currentEnd.getLastPriceInt();
            }
        }
    }
}
