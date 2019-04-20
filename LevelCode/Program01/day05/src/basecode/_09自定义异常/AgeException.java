package basecode._09自定义异常;

public class AgeException extends Exception {

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
