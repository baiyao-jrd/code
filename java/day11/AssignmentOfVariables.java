package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/16:03
 * @Description: 变量赋值
 */
public class AssignmentOfVariables {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
