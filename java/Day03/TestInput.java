package Day03;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/17:05
 * @Description: 接收从控制台输入的数据
 */
public class TestInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");

        int input = scanner.nextInt();

        System.out.println("您输入的整数是：" + input);
    }
}
