package day17.employee;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/20:49
 * @Description: 从键盘中输入员工对象信息，并封装为员工对象，添加到EmployeeService类的数组中，
 * 获取所有的员工对象，按照薪资从低到高排序输出。
 */
public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService ser = new EmployeeService();
        boolean flag = true;

        while (flag) {
            System.out.println();

            Employee emp = new Employee();

            System.out.print("请输入员工编号: ");
            emp.setId(scanner.next());

            System.out.print("请输入员工姓名: ");
            emp.setName(scanner.next());

            System.out.print("请输入员工薪水: ");
            emp.setSalary(scanner.nextDouble());

            System.out.print("请输入员工手机号: ");
            emp.setPhoneNum(scanner.nextLong());

            ser.addElem(emp);

            System.out.print("是否还要急需录入？[是/否]");

            if (scanner.next().equals("否")) {
                flag = false;
            }
        }

        System.out.println("目前系统存有" + ser.getTotal() + "名员工的信息, 详情如下: ");

        for (Employee employee : ser.returnMethod()) {
            if (employee != null)
                System.out.println(employee);
        }
    }
}
