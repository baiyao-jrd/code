package day17;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/9:34
 * @Description: 员工信息管理
 * 用键盘输入每个员工的基本信息 -> 编号、姓名、薪资、电话
 * 按照薪资从低到高排序后遍历显示员工信息
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入要录入信息的员工数量：");
        int nums = scanner.nextInt();

        boolean flag = !(nums <= 0);

        if (flag) {
            Employee[] employees = new Employee[nums];

            System.out.println();

            for (int i = 0; i < employees.length; i++) {
                Employee employee = new Employee();
                employees[i] = employee;

                System.out.print("请输入第" + (i + 1) + "个员工的编号：");
                employees[i].id = scanner.nextInt();

                System.out.println();

                System.out.print("请输入第" + (i + 1) + "个员工的姓名：");
                employees[i].name = scanner.next();

                System.out.println();

                System.out.print("请输入第" + (i + 1) + "个员工的薪资：");
                employees[i].salary = scanner.nextDouble();

                System.out.println();

                System.out.print("请输入第" + (i + 1) + "个员工的电话：");
                employees[i].phoneNum = scanner.nextLong();
            }

            for (int i = 0; i < employees.length; i++) {
                for (int j = i + 1; j < employees.length; j++) {
                    if (employees[i].salary > employees[j].salary) {
                        Employee temp;

                        temp = employees[j];
                        employees[j] = employees[i];
                        employees[i] = temp;
                    }
                }
            }

            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
