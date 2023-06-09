package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:20
 * @Description: 对一个三位数的个十百位求和
 */
public class EachDigitSumDemo {
    public static void main(String[] args) {
        int threeDigits = 521;

        int singleDigit = threeDigits % 10;
        int tenDigit = threeDigits % 100 / 10;
        int hundredDigit = threeDigits / 100;

        System.out.println(threeDigits + "的个位是：" + singleDigit + ",十位是：" + tenDigit + ",百位是：" + hundredDigit);
        System.out.println("按位求和：" + (singleDigit + tenDigit + hundredDigit));
    }
}
