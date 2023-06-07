package Day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/15:51
 * @Description: &运算 -> 6&3
 */
public class BitwiseOperatorsDemo4 {
    public static void main(String[] args) {
        System.out.println("6&3的运算结果为：" + (6 & 3));
    }
}

/**
 * 0000 0000 0000 0000 0000 0000 0000 0000
 *
 * 0000 0000 0000 0000 0000 0000 0000 0110 -> 6的补码
 *
 * 0000 0000 0000 0000 0000 0000 0000 0011 -> 3的补码
 *
 * 遇0得0,全1得1
 *
 * 0000 0000 0000 0000 0000 0000 0000 0010 -> 2的补码
 */