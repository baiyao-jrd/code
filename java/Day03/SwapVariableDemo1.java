package Day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:32
 * @Description: 交换两个变量的值
 */
public class SwapVariableDemo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("交换前 -> a: " + a + "\t" + "b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("交换后 -> a: " + a + "\t" + "b: " + b);
    }
}
