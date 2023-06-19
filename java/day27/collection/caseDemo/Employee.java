package day27.collection.caseDemo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/11:20
 * @Description:
 */
public class Employee {
    private int Id;
    private String name;
    private double salary;
    private long phoneNum;

    public Employee(int id, String name, double salary, long phoneNum) {
        Id = id;
        this.name = name;
        this.salary = salary;
        this.phoneNum = phoneNum;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
