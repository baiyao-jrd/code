package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/15:44
 * @Description: 负数无符号右移两位
 */
public class BitwiseOperatorsDemo3 {
    public static void main(String[] args) {
        System.out.println("-3 >>> 2的结果为：" + (-3 >>> 2));
    }
}

/**
 * 0000 0000 0000 0000 0000 0000 0000 0000
 *
 * 1000 0000 0000 0000 0000 0000 0000 0011 -> -3原码
 *
 * 1111 1111 1111 1111 1111 1111 1111 1101 -> -3补码
 *
 * 0011 1111 1111 1111 1111 1111 1111 1111 -> 1073741823
 */