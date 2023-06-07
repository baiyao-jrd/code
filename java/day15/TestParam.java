package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/16:39
 * @Description: 形参与实参
 */
public class TestParam {

    //int a -> 形参
    //int b -> 形参
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = -2;


        //sum(a, b)里面的a与b就是实参
        System.out.println(a + " + " + b + " = " + sum(a, b));

        //sum(1, 2)里面的1与2就是实参
        System.out.println("1 + 2 = " + sum(1, 2));

        int x = 3;
        int y = 4;
        int z = 5;

        if (sum((int)Math.pow(x, 2), (int)Math.pow(y, 2)) == Math.pow(z, 2)) {
            System.out.println(x + ", " + y + ", " + z + ": 可构成一个直角三角形~");
        }
    }
}
