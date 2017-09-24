package me.zyly.riska.api.holder;

import lombok.Data;
import me.zyly.riska.api.holder.runner.MarketDataRunner;
import me.zyly.riska.core.CoreConfig;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.*;
import java.io.IOException;

/**
 * @author David on 17/4/24.
 */
@EnableAutoConfiguration
@ComponentScan({"me.zyly.riska.api.holder.runner", "me.zyly.riska.api.holder.service"})
@Import(CoreConfig.class)
@Configuration
@EnableScheduling
public class Boot {
//    private static Logger LOGGER = LoggerFactory.getLogger(Boot.class);
    private @Autowired MarketDataRunner marketDataRunner;

    public static void main(String[] args) throws Exception {
//        new Boot().changeInstrumentID();
        SpringApplication.run(Boot.class, args);
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
        private String marketTypes;
    }

    /**
     * 每日8点30启动登录下载行情
     */
    @Scheduled(cron = "0 30 8 * * ? ")
    public void startLogin() {
        marketDataRunner.reLogin();
    }

    /**
     * 每日15点30注销下载行情
     */
    @Scheduled(cron = "0 30 15 * * ? ")
    public void destroyAPI() {
        marketDataRunner.destroyAPI();
    }

    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetail jobDetail) {
        CronTriggerFactoryBean factoryBean = new CronTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setCronExpression("0 0 6 ? * 6#3");
        return factoryBean;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(Trigger trigger) throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setTriggers(trigger);
        return factory;
    }

    @Bean
    public MethodInvokingJobDetailFactoryBean jobDetailFactoryBean(ApplicationContext context) {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();
        factoryBean.setTargetObject(this);
        factoryBean.setTargetMethod("changeInstrumentID");
        return factoryBean;
    }

}