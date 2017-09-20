package me.zyly.riska.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by hanzhe on 2017/7/21.
 */
@EnableMongoRepositories("me.zyly.riska.core.repository")
@ComponentScan(basePackages = "me.zyly.riska.core.service")
public class CoreConfig {
}
