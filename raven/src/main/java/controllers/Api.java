package controllers;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@RestController
@SpringBootApplication
public class Api {

    @GetMapping("/healthcheck")
    String healthcheck() {
        Gson gson = new Gson();
        var res = new HealthcheckResponse();

        return gson.toJson(res);
    }

    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }

    class HealthcheckResponse {
        private String message;
        private long timestamp;

        public HealthcheckResponse() {
            this.message = "ok";
            this.timestamp = Instant.now().toEpochMilli();
        }
    }
}
