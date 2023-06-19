package day27.collection.caseDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/11:21
 * @Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println();

            System.out.print("请输入员工编号: ");
            int id = scanner.nextInt();

            System.out.print("请输入员工姓名: ");
            String name = scanner.next();

            System.out.print("请输入员工薪资: ");
            double salary = scanner.nextDouble();

            System.out.print("请输入员工电话: ");
            long phoneNum = scanner.nextLong();

            a.add(new Employee(id, name, salary, phoneNum));

            System.out.print("是否还需要录入? [是/否]");
            String answer = scanner.next();

            if (answer.charAt(0) == '否') {
                flag = false;
            }
        }

        System.out.println("目前有" + a.size() + "名员工, 分别是: ");

        for (Object o : a) {
            System.out.println(o);
        }
    }
}
