package day17.employee;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/20:44
 * @Description:    员工类
 *                      编号、姓名、薪资、电话
 */
public class Employee {
    private String id;
    private String name;
    private double salary;
    private long phoneNum;

    public Employee() {
    }

    public Employee(String id, String name, double salary, long phoneNum) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phoneNum = phoneNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
