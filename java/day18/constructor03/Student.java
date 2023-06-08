package day18.constructor03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:54
 * @Description:
 */
public class Student extends Person {
    private double score;

    public Student(String name, int age) {
        super(name, age);
        System.out.println("子类有参构造器01~");
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
        System.out.println("子类有参构造器02~~");
    }
}
