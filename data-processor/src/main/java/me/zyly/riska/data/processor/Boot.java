package me.zyly.riska.data.processor;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import lombok.Data;
import me.zyly.riska.core.CoreConfig;
import me.zyly.riska.core.domain.MarketData;
import me.zyly.riska.core.repository.MarketDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.util.StringUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings("SpringJavaAutowiringInspection")
@EnableAutoConfiguration
@ComponentScan("me.zyly.riska.data.processor.runner")
@Import(CoreConfig.class)
public class Boot {

    private static final Logger LOGGER = LoggerFactory.getLogger(Boot.class);
    private static final String CONSTANT_TITLE = "交易日";

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }

    @ConfigurationProperties("data.init")
    @Data
    @Configuration
    public static class InitConfig {
        private String metaPath;
        private String label;
    }

    private @Autowired
    MarketDataRepository marketDataRepository;
    private @Autowired MongoTemplate mongoTemplate;

    @Bean
    public int dateInit(InitConfig initConfig) {
        MarketData md = marketDataRepository.findOneByTradingDayAndInstrumentID(20160104, "IC1601");
        if(null != md) {
            LOGGER.info("data :{}, maybe initialed!!!!", md);
            return 0;
        }
        LOGGER.info("init start... {}", initConfig.getMetaPath());
        File file = new File(initConfig.getMetaPath());
        File[] files;
        if(file.isDirectory()) {
            files = file.listFiles();
        }else {
            files = new File[1];
            files[0] = file;
        }
        assert files != null;
        List<String> fileName = new ArrayList<>();
        Stream.of(files).forEach(csv-> {
            if(!csv.getAbsoluteFile().toString().contains(initConfig.getLabel())) {
                return;
            }
            fileName.add(csv.getAbsolutePath());
        });
        Collections.sort(fileName);
        DBCollection col = mongoTemplate.getCollection("marketData");
        fileName.forEach(csv -> {
            FileInputStream fis = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            try {
                br = new BufferedReader(isr = new InputStreamReader(fis = new FileInputStream(csv), "GBK"));
                List<DBObject> list = new ArrayList<>();
                br.lines().forEach(line -> {
                    //noinspection StatementWithEmptyBody
                    if(!StringUtils.isEmpty(line) && !line.trim().startsWith(CONSTANT_TITLE)) {
                        String[] fields = line.split(",");
                        MarketData marketData = coverToMarketData(fields);
                        BasicDBObject object = new BasicDBObject();
                        mongoTemplate.getConverter().write(marketData, object);
                        list.add(object);
                    }
                });
                col.insert(list);
                LOGGER.info("file: {}, data inserted : {}", csv, list.size());

            } catch (Exception e) {
                LOGGER.error("import data from file error", e);
            } finally {
                close(br, isr, fis);
            }
        });
        return 0;
    }

    private MarketData coverToMarketData(String[] fields) {
        if(fields.length != 44) {
            throw new IllegalArgumentException("meta data not be cert");
        }
        MarketData marketData = new MarketData();
        marketData.setTradingDay(Integer.parseInt(fields[0]));//A
        marketData.setInstrumentID(fields[1]);//B
        marketData.setLastPrice(Double.parseDouble(fields[4]));//E
        marketData.setOpenPrice(Double.parseDouble(fields[8]));//H
        marketData.setHighestPrice(Double.parseDouble(fields[9]));//I
        marketData.setLowestPrice(Double.parseDouble(fields[10]));//G
        marketData.setUpdateTime(fields[20]);//T
        marketData.setUpdateMillisec(Integer.parseInt(fields[21]));//U
        marketData.optimizeData();
        return marketData;
    }

    private void close(Closeable... closeables) {
        Stream.of(closeables).forEach(closable->{
            try {
                if(null != closable) {
                    closable.close();
                }
            }catch (Exception e) {
                LOGGER.error("close error", e);
            }
        });
    }
}
