package day29.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:17
 * @Description:    确定score是String类型
 */
public class ChineseStudent extends Student<String> {
    public ChineseStudent(String name, String score) {
        super(name, score);
    }
}
