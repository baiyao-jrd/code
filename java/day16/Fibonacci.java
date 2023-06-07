package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/18:52
 * @Description: 递归调用 - 斐波那契
 */
public class Fibonacci {
    public static int fibonacci(int num) {
        if (num == 0 || num == 1)
            return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
