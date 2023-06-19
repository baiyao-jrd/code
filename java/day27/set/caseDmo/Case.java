package day27.set.caseDmo;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:47
 * @Description:
 */
public class Case {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("江润冬", new MyDate(1996, 9, 23)));
        employees.add(new Employee("江润冬", new MyDate(1996, 9, 23)));
        employees.add(new Employee("江润冬", new MyDate(1996, 9, 25)));
        employees.add(new Employee("江明阳", new MyDate(1996, 9, 25)));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
