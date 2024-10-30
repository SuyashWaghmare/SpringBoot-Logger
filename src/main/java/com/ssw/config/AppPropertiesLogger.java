package com.ssw.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;



@Component
public class AppPropertiesLogger {

    private static final Logger logger = LoggerFactory.getLogger(AppPropertiesLogger.class);

    @Autowired
    private Environment environment;

    @PostConstruct
    public void logProperties() {
        logger.info("Application Properties:");
        logger.info("Application Name: {}", environment.getProperty("spring.application.name"));
        logger.info("Server Port: {}", environment.getProperty("server.port"));
        logger.info("Database URL: {}", environment.getProperty("spring.datasource.url"));
        logger.info("Database Driver: {}", environment.getProperty("spring.datasource.driver-class-name"));
        logger.info("Database Username: {}", environment.getProperty("spring.datasource.username"));
        logger.info("Database Password: {}", environment.getProperty("spring.datasource.password"));
        logger.info("Hibernate Dialect: {}", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
        logger.info("Hibernate DDL Auto: {}", environment.getProperty("spring.jpa.hibernate.ddl-auto"));
        logger.info("Show SQL: {}", environment.getProperty("spring.jpa.show-sql"));
    }
}
