package dev.dalibor.kafka_playground.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BasicLogger implements DLogger {

    private Logger logger = LoggerFactory.getLogger(BasicLogger.class);
    @Override
    public void consoleInfo(String message) {
        logger.info(message);
    }
}
