package task08;

import task08.Exceptions.AuthException;
import task08.Exceptions.UserLimitExceededException;
import task08.Exceptions.WrongLoginException;
import task08.Exceptions.WrongPasswordException;

public interface LoginService {
    void register(final String login, final String password, final String confirmPassword)
            throws WrongLoginException, WrongPasswordException, UserLimitExceededException;

    void login(final String login, final String password)
            throws AuthException;
}
