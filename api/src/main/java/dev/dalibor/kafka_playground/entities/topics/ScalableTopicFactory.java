package dev.dalibor.kafka_playground.entities.topics;

public class ScalableTopicFactory implements TopicFactory {
    @Override
    public Topic create(int numberOfPartitions) {
        return new ScalableTopic("t_scalable", numberOfPartitions);
    }
}
