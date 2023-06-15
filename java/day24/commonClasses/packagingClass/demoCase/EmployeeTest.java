package day24.commonClasses.packagingClass.demoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/17:14
 * @Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("江明阳", 50000d, 22);
        employees[1] = new Employee("江润冬", 40000d, 27);
        employees[2] = new Employee("江奇志", 20000d, 52);

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() > employees[j].getSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
