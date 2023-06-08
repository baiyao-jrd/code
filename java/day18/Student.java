package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:24
 * @Description:    student类
 */
public class Student {
    private String name;
    private int age;
    private double score;

    public String getBasicdetail() {
        return "姓名: " + name + ", 年龄: " + age;
    }

    public String getDetail() {
        return getBasicdetail() + ", 成绩: " + score;
    }

    public void study() {
        System.out.println("好好学习, 天天向上~~");
    }
}
