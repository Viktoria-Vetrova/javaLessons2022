package task08;

import task08.Exceptions.AuthException;
import task08.Exceptions.UserLimitExceededException;
import task08.Exceptions.WrongLoginException;
import task08.Exceptions.WrongPasswordException;

import java.util.Arrays;

public class Auth implements LoginService {
    private final int limit;
    private final User[] users;
    private final String validLoginChars = "_";
    private final String validPasswordChars = "_$@";

    private int currentCountUser = 0;

    public Auth(int limit) {
        this.limit = limit;
        users = new User[limit];
    }

    @Override
    public void register(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, UserLimitExceededException {
        if (this.limit <= currentCountUser) {
            throw new UserLimitExceededException(this.limit);
        }

        checkLogin(login);
        checkPassword(password, confirmPassword);

        users[currentCountUser] = new User(login, password.hashCode());
        currentCountUser++;
        System.out.printf("User [%s] registered%n", login);


    }

    private void checkLogin(String login) throws WrongLoginException {
        for (User user : users) {
            if (user != null && login.equals(user.getLogin())) {
                throw new WrongLoginException(String.format("User with login: %s already exists", login));
            }
        }

        if (login.length() < 3 || login.length() > 20) {
            throw new WrongLoginException(String.format("Login length is %d, Login should be more than 3 and less than 20", login.length()));
        }

        for (char ch : login.toCharArray()) {
            for (char valid : validLoginChars.toCharArray()) {
                if (!(Character.isLetterOrDigit(ch) || (ch == valid))) {
                    throw new WrongLoginException(String.format("Login has wrong char %s", ch));
                }
            }
        }
    }

    private void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password don't match with confirmed password");
        }

        if (password.length() < 10 || password.length() > 20) {
            throw new WrongPasswordException(String.format("Password length is %d, Password should be more than 10 and less than 20", password.length()));
        }

        for (char ch : password.toCharArray()) {
            for (char valid : validPasswordChars.toCharArray()) {
                if (!(Character.isLetterOrDigit(ch) || (ch == valid))) {
                    throw new WrongPasswordException(String.format("Password has wrong char %s", ch));
                }
            }
        }

    }

    @Override
    public void login(String login, String password)
            throws AuthException {
        for (User user : users) {
            if (user != null && login.equals(user.getLogin())) {
                if (user.getPasswordHash() == password.hashCode()) {
                    System.out.printf("User [%s] authorization success \n", login);
                    return;
                }
            }
        }

        throw new AuthException();
    }


    @Override
    public String toString() {
        return "Auth{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
