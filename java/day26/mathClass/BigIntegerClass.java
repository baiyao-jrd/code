package day26.mathClass;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/17:23
 * @Description:
 */
public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("142345756856708607837528354167352496");
        System.out.println(bigInteger);

        BigInteger a = new BigInteger("6");
        BigInteger b = new BigInteger("4");

        System.out.println(a.max(b));
        System.out.println(a.min(b));

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
}
