package day21.salaryOfEmployee;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/10:43
 * @Description:
 */
public abstract class Employee {
    private String name;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString() {
        return "姓名: " + name + ", 生日: " + birthday.toDateString() + ", 当月工资: " + earnings();
    }
}
