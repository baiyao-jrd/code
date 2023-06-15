package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/14:23
 * @Description:
 */
public class LoginException extends Exception {
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}
