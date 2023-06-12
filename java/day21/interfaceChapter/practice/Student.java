package day21.interfaceChapter.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/16:23
 * @Description:
 */
public class Student implements Sortable {
    private String name;
    private double Score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public int sort(Object obj) {
        // 学生成绩是从大到小，所以这里总体加一个负号
        return -(int)(this.Score - ((Student)obj).Score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
