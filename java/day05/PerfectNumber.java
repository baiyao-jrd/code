package day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/10/17:32
 * @Description: 完数 -> 某数等于其所有因子之和 -> 6=1+2+3 -> 求1000以内的所有完数
 */
public class PerfectNumber {
    public static void main(String[] args) {
        /**
         * 1. 循环1000以内的数
         * 2. 求出每个数的因子
         * 3. 对该数的所有因子加和，如果等于其本身就输出
         */

        for (int num = 2; num < 1000; num++) {
            int sum = 0;

            for (int i = 1; i <= Math.sqrt(num); i++) {
                for (int j = num; j >= Math.sqrt(num); j--) {
                    if (i * j == num) {
                        sum += i;
                        if (i != j & j != num) sum += j;
                    }
                }
            }

            if (sum == num) {
                System.out.println(num + "是一个完数~");
            }
        }
    }
}
