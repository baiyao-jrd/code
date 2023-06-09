package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:40
 * @Description: 交换两数的值 -> 使用异或
 */
public class SwapVariableDemo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = -2;

        System.out.println("交换前 -> a: " + a + ", b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("交换后 -> a: " + a + ", b: " + b);
    }
}
