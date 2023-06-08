package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:29
 * @Description:
 */
public class StudentExtends extends Person {
    private double score;

    public String getDetail() {
        return getBasicDetail() + ", 成绩: " + score;
    }

    public void study() {
        System.out.println("好好学习, 天天向上~~");
    }
}
