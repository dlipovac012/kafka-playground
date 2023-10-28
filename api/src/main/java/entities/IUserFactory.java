package entities;

public interface IUserFactory {
    IUser create(String name, String password);
}
