package task08;

public class User {
    private final String login;
    private final int passwordHash;

    public User(String login, int passwordHash) {
        this.login = login;
        this.passwordHash = passwordHash;
    }

    public String getLogin() {
        return this.login;
    }

    public int getPasswordHash() {
        return this.passwordHash;
    }
}
