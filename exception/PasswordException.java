package exception;

public class PasswordException extends Exception {
    private String detail;

    public PasswordException() {
        detail = "Incorrect password";
    }

    public PasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}