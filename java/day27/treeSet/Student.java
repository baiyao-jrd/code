package day27.treeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/16:25
 * @Description:
 */
public class Student implements Comparable {
    private int id;
    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return id - ((Student)o).id;
    }
}
