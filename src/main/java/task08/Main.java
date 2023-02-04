package task08;

import task08.Exceptions.AuthException;
import task08.Exceptions.UserLimitExceededException;
import task08.Exceptions.WrongLoginException;
import task08.Exceptions.WrongPasswordException;

public class Main {

    public static void main(String[] args) throws UserLimitExceededException, WrongLoginException, WrongPasswordException, AuthException {
        Auth auth = new Auth(3);
        // success
        auth.register("Lily", "a2345678901", "a2345678901");

        // Login has wrong char
//        auth.register("Li+ly", "12345678901", "12345678901");

        // Login should be more than 3 and less than 20 symbols
//        auth.register("Li", "12345678901", "12345678901");

        // User already exists
//        auth.register("Lily", "12345678901", "12345678901");

        // User limit exceeded
//        auth.register("Dicky", "12345678901", "12345678901");
//        auth.register("Pu_ppy", "12345678901", "12345678901");

        // Password should be more than 10 and less than 20
//        auth.register("Puppy", "123456789", "123456789");

        // Password has wrong char
//        auth.register("Lil1y", "1234567#8901", "1234567#8901");

        // Password don't match with confirmed password
//        auth.register("Dicky", "12345_678901", "12345678901");

        // success login
        auth.login("Pu_ppy", "12345678901");
//        auth.login("Lily", "a2345678901");
////        auth.login("Lioly", "a2345678901");
//
//        // User authorization failed
//        auth.login("Lily", "12345678901");
    }
}
