package dev.dalibor.kafka_playground.entities;

public interface User {
    boolean isPasswordValid();

    String getName();

    String getPassword();
}
