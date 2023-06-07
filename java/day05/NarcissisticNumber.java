package day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/10/17:08
 * @Description: 水仙花数 -> for循环练习
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        /**
         * 水仙花数：3位数 -> 其各个位的数字的立方和等于其本身 -> 153 = 1*1*1 + 5*5*5 + 3*3*3
         *
         * 求所有水仙花数 -> 三位数的话 -> [100,999]
         */

        for (int narcissisticNumber = 100; narcissisticNumber <= 999; narcissisticNumber++) {
            int singleDigit = narcissisticNumber % 10;
            int tenDigit = narcissisticNumber % 100 / 10;
            int hundredDigit = narcissisticNumber / 100;

            if (Math.pow(singleDigit, 3) + Math.pow(tenDigit, 3) + Math.pow(hundredDigit, 3) == narcissisticNumber) {
                System.out.println(narcissisticNumber + "是一个水仙花数~");
            }
        }
    }
}
