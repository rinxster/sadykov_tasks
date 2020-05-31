package task_10;

/*

Создайте собственное исключение MyOwnException, конструктор которого принимает строку с сообщением об ошибке.

 */

public class MyOwnException extends Exception{
    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyOwnException(Throwable cause) {
        super(cause);
    }

    public MyOwnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
