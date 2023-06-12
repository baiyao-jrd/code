package day21.salaryOfEmployee;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/10:53
 * @Description:
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new HourlyEmployee("江润冬", new MyDate(1996, 9, 23), 300.0, 200);
        employees[1] = new SalariedEmployee("江明阳", new MyDate(2001, 6, 6), 20000);
        employees[2] = new HourlyEmployee("江奇志", new MyDate(1975, 6, 8), 600, 150);

        System.out.print("输入月份：");
        Scanner scanner = new Scanner(System.in);

        int monthFlag = scanner.nextInt();

        for (Employee employee : employees) {
            System.out.println("员工对象类型：" + employee.getClass() + ", " + employee + ("class day21.salaryOfEmployee.SalariedEmployee".equals(employee.getClass().toString()) && monthFlag == employee.getBirthday().getMonth() ? ", 由于本月是员工生日，所以额外奖励100元工资，最终的月薪是" + (employee.earnings() + 100) : ""));
        }
    }
}
