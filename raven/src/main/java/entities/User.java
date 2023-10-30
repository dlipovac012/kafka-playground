package entities;

public interface User {
    boolean isPasswordValid();

    String getName();

    String getPassword();
}
