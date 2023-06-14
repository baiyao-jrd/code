package day22.comparatorInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/18:53
 * @Description:
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
