package task08.Exceptions;

public class AuthException extends Exception {
    public AuthException() {
        super("User authorization failed");
    }
}
