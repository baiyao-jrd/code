package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:59
 * @Description: 顺序结构的执行
 */
public class TestStatement {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //修改x,y的值
        x = x * 10;
        y = 2 * x + y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
