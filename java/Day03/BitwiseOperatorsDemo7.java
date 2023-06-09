package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:05
 * @Description: 取反 ~6
 */
public class BitwiseOperatorsDemo7 {
    public static void main(String[] args) {
        System.out.println("~6的结果为：" + (~6));
    }
}

/**
 * 0110
 *
 * 1111 1111 1111 1111 1111 1111 1111 1001 -> 这是取反后的结果，注意符号位也得去反
 *
 * 将补码还原
 *
 * 1000 0000 0000 0000 0000 0000 0000 0111 -> -7
 */