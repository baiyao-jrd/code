package day17.employee;

import static java.lang.Math.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/20:48
 * @Description: 实现不断地往数组中添加元素，容量不够时，扩充为原来的1.5倍
 * 提供返回所有员工对象的方法
 * <p>
 * 有一个记录存储员工数量的变量 -> total
 */
public class EmployeeService {
    private static Employee[] empArr = new Employee[2];
    int total = 0;

    public int getTotal() {
        return total;
    }

    public void addElem(Employee emp) {
        if (total == empArr.length) {
            Employee[] empNewArr = new Employee[(int) round(total * 1.5)];

            for (int i = 0; i < total; i++) {
                empNewArr[i] = empArr[i];
            }

            empArr = empNewArr;
        }

        empArr[total] = emp;
        total++;
    }

    public Employee[] returnMethod() {
        for (int index = 0; index < empArr.length - 1 && index < total - 1; index++) {
            for (int cursor = index + 1; cursor < empArr.length && cursor < total; cursor++) {
                if (empArr[index].getSalary() > empArr[cursor].getSalary()) {
                    Employee temp = empArr[cursor];
                    empArr[cursor] = empArr[index];
                    empArr[index] = temp;
                }
            }
        }

        return empArr;
    }
}
