package day04;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/09/16:02
 * @Description: 解一元二次方程根 -> ax^2 + bx + c -> a,b,c从键盘输入
 *                             -> 练习if else if else的多分支结构
 */
public class EquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2的3次方测试值：" + Math.pow(2, 3));

        System.out.print("请输入a的值：");
        double a = scanner.nextInt();

        System.out.print("请输入b的值：");
        double b = scanner.nextInt();

        System.out.print("请输入c的值：");
        double c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("输入有误，方程等式不成立~");
            } else {
                System.out.println("一元一次方程的解为：" + -(c / b));
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta >0) {
                System.out.println("一元二次方程有两个解：x1 = " + (-b + Math.sqrt(delta)) / (2 * a) + ", x2 = " + (-b - Math.sqrt(delta) / (2 * a)) );
            } else if (delta == 0) {
                System.out.println("一元二次方程有一个解：x = " + (- b / (2 * a)));
            } else {
                System.out.println("一元二次方程在实数范围内没有解。");
            }
        }
    }
}
