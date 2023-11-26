package dev.dalibor.kafka_playground.entities.topics;

import java.util.List;

public interface TopicFactory {
    Topic create(int numberOfPartitions);
}
