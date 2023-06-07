package Day03;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/17:11
 * @Description: 从控制台中输入个人信息并打印至控制台
 */
public class InputInfoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = scanner.next();

        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入性别：");
        char gender = scanner.next().charAt(0);

        System.out.println("请输入体重：");
        double weight = scanner.nextDouble();

        System.out.println("请输入是否已婚：");
        Boolean marry = scanner.nextBoolean();

        System.out.println("您的个人信息如下：");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("体重：" + weight);
        System.out.println("婚否：" + (marry ? "已婚" : "未婚"));
    }
}
