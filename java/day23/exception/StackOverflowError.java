package day23.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:20
 * @Description:
 */
public class StackOverflowError {
    public static void main(String[] args) {
        method();
    }

    public static void method() {

        // StackOverflowError
        method();
    }
}

