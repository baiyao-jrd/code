package day26.mathClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/17:16
 * @Description:
 */
public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5.5));

        System.out.println(Math.floor(-5.56));
        System.out.println(Math.ceil(-5.56));

        System.out.println(Math.round(5.5));
        System.out.println(Math.round(-5.5));
        System.out.println(Math.round(-5.4));
        System.out.println(Math.round(-5.6));

        System.out.println(Math.max(3, -5));
        System.out.println(Math.min(-5, -6));
        System.out.println(Math.random());
    }
}
