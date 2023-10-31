package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Api {

    @RequestMapping("/healthcheck")
    String healthcheck() {
        return "Hello from API!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
}
