package day26.arrays;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/11:55
 * @Description:
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return -age + ((Person)o).age;
    }
}
