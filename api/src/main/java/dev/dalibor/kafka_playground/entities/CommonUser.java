package dev.dalibor.kafka_playground.entities;


public class CommonUser implements User {

    String name;
    String password;

    public CommonUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean isPasswordValid() {
        return password != null && password.length() > 5;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
