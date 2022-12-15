package exception;

public class LoginException extends Exception {
    private String detail;

    public LoginException() {
        detail = "Incorrect login";
    }

    public LoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}