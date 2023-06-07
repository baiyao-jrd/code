package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/22:28
 * @Description: 走台阶
 *                  有n级台阶，每次只能跨1级或2级，问走完n级台阶共有多少种走法
 */
public class Step {
    public static int step(int base) {
        if (base == 1 || base == 2) {
            return base;
        }
        return step(base - 2) + step(base - 1);
    }

    public static void main(String[] args) {
        System.out.println(step(3));
        System.out.println(step(2));
        System.out.println(step(10));
    }
}


