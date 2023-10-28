package entities;

public interface IUser {
    boolean isPasswordValid();

    String getName();

    String getPassword();
}
