package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/14:44
 * @Description:
 */
public class UniversityStudent extends Student implements LearnEnglish, LearnComputer{
    @Override
    public void LearnComputer() {
        System.out.println("大学生学计算机");
    }

    @Override
    public void LearnEnglish() {
        System.out.println("大学生学英语");
    }

    @Override
    public void study() {
        System.out.println("大学生学习");
    }

    @Override
    public void test() {
        System.out.println("大学生测试");
    }
}
