package dev.dalibor.kafka_playground.controllers.kafka;

import dev.dalibor.kafka_playground.utils.DLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private DLogger logger;

//    Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @GetMapping("topics")
    public ResponseEntity<List<String>> getAllTopics() {
        List<String> topics = new ArrayList<>();
        topics.add("topic-1");
        topics.add("topic-2");

        logger.consoleInfo("logged here");

        return ResponseEntity.ok(topics);
    }
}
