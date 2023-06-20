package day29.generics.caseDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/12:02
 * @Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("sally", 10000d);
        employees[1] = new Employee("bob", 15000d);
        employees[2] = new Employee("azly", 3000d);
        employees[3] = new Employee("aria", 3000d);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                if ((double) (a.getSalary()) != (double)(b.getSalary())) {
                    return Double.compare(a.getSalary(), b.getSalary());
                } else {
                    return a.getName().compareTo(b.getName());
                }
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
