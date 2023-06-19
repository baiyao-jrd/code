package day27.set.caseDmo;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:42
 * @Description:
 */
public class Employee {
    private String name;
    private MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
