package day26.mathClass;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/17:31
 * @Description:
 */
public class BigdecimalClass {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(12425.777777);
        BigDecimal b = new BigDecimal("23532645.58657687");

        BigDecimal c = new BigDecimal("1.55");
        BigDecimal d = new BigDecimal("0.45");

        System.out.println(c.max(d));
        System.out.println(c.min(d));
        System.out.println(c.add(d));
        System.out.println(c.subtract(d));
        System.out.println(c.multiply(d));
//        System.out.println(c.divide(d));
        System.out.println(c.divide(d, BigDecimal.ROUND_CEILING));
    }
}
