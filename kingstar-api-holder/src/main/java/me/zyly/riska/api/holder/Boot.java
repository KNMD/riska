package me.zyly.riska.api.holder;

import lombok.Data;
import me.zyly.riska.core.CoreConfig;
import me.zyly.riska.core.domain.MarketData;
import me.zyly.riska.core.repository.MarketDataRepository;
import org.bson.Document;
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

/**
 * @author David on 17/4/24.
 */
@EnableAutoConfiguration
@ComponentScan("me.zyly.riska.api.holder.runner")
@Import(CoreConfig.class)
@Configuration
public class Boot {
    static volatile DataTransporter<MarketData> dataTransporter;
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(Boot.class);
    private @Autowired MarketDataRepository marketDataRepository;
    @Bean
    public int initStaticMongoDBConfig(MongoDBConfig config) {
//        mongoDBConfig = config;
        dataTransporter = new DataTransporter<>(data-> {
            marketDataRepository.save(data);
            LOGGER.debug("market data saved! data: {}", data);
        });
        dataTransporter.doWork();
        LOGGER.info("data transport is working!!");
        return 0;
    }


    @Data
    @Configuration
    @ConfigurationProperties("spring.data.mongodb")
    public static class MongoDBConfig {
        private String host;
        private String port;
        private String database;
        private String username;
        private String password;
    }

    @Data
    @Configuration
    @ConfigurationProperties("kingstarAPI")
    public static class KingstarAPIConfig {
        private String host;
        private String logPath;
        private String brokerID;
        private String userID;
        private String password;
        private String marketDataID;
    }

}