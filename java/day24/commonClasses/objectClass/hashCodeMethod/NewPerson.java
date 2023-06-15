package day24.commonClasses.objectClass.hashCodeMethod;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:04
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
