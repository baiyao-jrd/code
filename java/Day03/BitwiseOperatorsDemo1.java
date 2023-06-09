package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/15:32
 * @Description: 左移两位
 */
public class BitwiseOperatorsDemo1 {
    public static void main(String[] args) {
        System.out.println("3<<2的结果为：" + (3<<2));
    }
}

/**
 * 正数的原反补码一样
 *
 * 0000 0000 0000 0000 0000 0000 0000 0000
 *
 * 0000 0000 0000 0000 0000 0000 0000 0011
 *
 * 0000 0000 0000 0000 0000 0000 0000 1100 -> 12
 */
