package task08.Exceptions;

public class UserLimitExceededException extends Exception {

    public UserLimitExceededException(int count) {
        super(String.format("User limit exceeded. Limit is %d", count));
    }
}
