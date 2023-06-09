package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:01
 * @Description: 异或运算 6 ^ 3
 */
public class BitwiseOperatorsDemo6 {
    public static void main(String[] args) {
        System.out.println("6 ^ 3的结果为：" + (6 ^ 3));
    }
}

/**
 * 0000 0000 0000 0000 0000 0000 0000 0110
 * 0000 0000 0000 0000 0000 0000 0000 0011
 *
 * 0000 0000 0000 0000 0000 0000 0000 0101 -> 相同为0，相异为1 -> 5
 */