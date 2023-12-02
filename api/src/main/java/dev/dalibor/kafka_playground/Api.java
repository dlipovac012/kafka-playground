package dev.dalibor.kafka_playground;

import dev.dalibor.kafka_playground.utils.BasicLogger;
import dev.dalibor.kafka_playground.utils.DLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Api {

    @Autowired
    private DLogger logger;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Api.class, args);
        BasicLogger consoleLogger = context.getBean(BasicLogger.class);

        consoleLogger.consoleInfo("Hello");
    }
}
