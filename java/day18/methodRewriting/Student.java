package day18.methodRewriting;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:02
 * @Description:
 */
public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public String detail() {
        return super.detail() + ", 分数: " + score;
    }
}
