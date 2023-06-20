package day29.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/10:29
 * @Description:
 */
public class TestParam {
    public static void main(String[] args) {
        System.out.println(max(3, 6));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
