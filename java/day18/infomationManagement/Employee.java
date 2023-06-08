package day18.infomationManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:35
 * @Description:
 */
public class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, long phoneNum, String id, double salary) {
        super(name, phoneNum, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String detail() {
        return super.detail() + ", 薪资: " + salary;
    }
}
