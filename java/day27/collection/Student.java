package day27.collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:59
 * @Description:
 */
public class Student {
    private int Id;
    private String name;

    public Student(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
