package dev.dalibor.kafka_playground;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Api.class);

        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
