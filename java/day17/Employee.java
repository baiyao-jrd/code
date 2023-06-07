package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/9:40
 * @Description: 员工的基本信息 -> 编号、姓名、薪资、电话
 */
public class Employee {
    int id;
    String name;
    double salary;
    long phoneNum;

    public Employee() {
    }

    public Employee(int id, String name, double salary, long phoneNum) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
