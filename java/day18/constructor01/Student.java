package day18.constructor01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:37
 * @Description:
 */
public class Student extends Person {
    private double score;

    public Student() {
        System.out.println("子类无参构造器");
    }

    public Student(String name, double score) {
        super(name);
        this.score = score;
        System.out.println("子类有参构造器~~");
    }
}
