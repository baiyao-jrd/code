package day18.infomationManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:34
 * @Description:
 */
public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, long phoneNum, String id, double score) {
        super(name, phoneNum, id);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String detail() {
        return super.detail() + ", 分数: " + score;
    }
}
