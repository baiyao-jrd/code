package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/15:37
 * @Description: 负数右移两位
 */
public class BitwiseOperatorsDemo2 {
    public static void main(String[] args) {
        System.out.println("-3>>2的结果为：" + (-3>>2));
    }
}

/**
 * 0000 0000 0000 0000 0000 0000 0000 0000
 *
 * 1000 0000 0000 0000 0000 0000 0000 0011 -> 负数原码
 *
 * 1111 1111 1111 1111 1111 1111 1111 1100 -> 负数反码
 *
 * 1111 1111 1111 1111 1111 1111 1111 1101 -> 负数补码
 *
 * 1111 1111 1111 1111 1111 1111 1111 1111 -> 右移两位，再-1取反，-1
 */
