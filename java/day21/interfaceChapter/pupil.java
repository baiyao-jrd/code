package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/14:42
 * @Description:
 */
public class pupil extends Student {

    @Override
    public void study() {
        System.out.println("小学生学习");
    }

    @Override
    public void test() {
        System.out.println("小学生测试");
    }
}
