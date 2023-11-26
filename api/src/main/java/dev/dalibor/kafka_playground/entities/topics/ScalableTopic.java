package dev.dalibor.kafka_playground.entities.topics;

import java.util.List;

public class ScalableTopic implements Topic {
    private String name;
    private int numberOfPartitions;

    protected ScalableTopic(String name, int numberOfPartitions) {
        this.name = name;
        this.numberOfPartitions = numberOfPartitions;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfPartitions() {
        return numberOfPartitions;
    }

    @Override
    public List<String> getPartitions() {
        // TODO: Write this method properly!!
        return List.of("partition_0", "partition_1", "partition_2");
    }
}
