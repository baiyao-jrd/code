package day24.commonClasses.objectClass.equalsMethod;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/15:17
 * @Description:
 */
public class NewPerson {
    private String name;
    private int age;

    public NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewPerson newPerson = (NewPerson) o;
        return age == newPerson.age && Objects.equals(name, newPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
