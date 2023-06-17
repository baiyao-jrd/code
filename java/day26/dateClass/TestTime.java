package day26.dateClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/22:03
 * @Description:
 */
public class TestTime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long sum = 0;

        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        System.out.println(sum);

        long endTime = System.currentTimeMillis();

        System.out.println("程序耗时: " + (endTime - startTime));
    }
}
