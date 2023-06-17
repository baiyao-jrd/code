package day26.arrays;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/12:26
 * @Description:
 */
public class OldPerson {
    private String name;
    private int age;

    public OldPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldPerson oldPerson = (OldPerson) o;
        return age == oldPerson.age && Objects.equals(name, oldPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
