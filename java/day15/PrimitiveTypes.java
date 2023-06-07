package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/16:51
 * @Description:
 */
public class PrimitiveTypes {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println(a + "与" + b + "交换之后，得到：" + a + ", " + b);
    }
}

//  1与2交换之后，得到：1, 2
//  数据的副本传给了方法，方法入栈后创建了两个局部变量，方法弹出后，局部变量也消失了，原来的两个值并没有被交换。