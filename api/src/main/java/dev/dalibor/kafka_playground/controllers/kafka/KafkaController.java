package dev.dalibor.kafka_playground.controllers.kafka;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @GetMapping("topics")
    public ResponseEntity<List<String>> getAllTopics() {
        List<String> topics = new ArrayList<>();
        topics.add("topic-1");
        topics.add("topic-2");

        return ResponseEntity.ok(topics);
    }
}
