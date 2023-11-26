package dev.dalibor.kafka_playground.entities.topics;

import java.util.List;

public interface Topic {
    String getName();

    int getNumberOfPartitions();

    List<String> getPartitions();
}
