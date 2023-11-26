package dev.dalibor.kafka_playground.entities;

public interface UserFactory {
    User create(String name, String password);
}
