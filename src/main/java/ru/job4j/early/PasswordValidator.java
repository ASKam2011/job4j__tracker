package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;
        for (char pass : password.toCharArray()) {
            if (Character.isLowerCase(pass)) {
                lowerCase = true;
            }
            if (Character.isUpperCase(pass)) {
                upperCase = true;
            }
            if (Character.isDigit(pass)) {
                hasDigit = true;
            }
            if (!Character.isLetter(pass) && !Character.isDigit(pass)) {
                hasSymbol = true;
            }
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] exceptions = {"qwerty", "12345", "password", "admin", "user"};
        for (String except : exceptions) {
            if (password.toLowerCase().contains(except)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
