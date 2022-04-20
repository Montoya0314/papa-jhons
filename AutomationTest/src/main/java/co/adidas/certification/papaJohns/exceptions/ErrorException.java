package co.adidas.certification.papaJohns.exceptions;

public class ErrorException extends AssertionError{

    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }

}
