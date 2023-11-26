package dev.dalibor.kafka_playground.entities.topics;

public interface TopicFactory {
    Topic create(int numberOfPartitions);
}
