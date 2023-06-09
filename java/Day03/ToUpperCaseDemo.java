package day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/08/16:52
 * @Description: 将小写字母转为大写字母
 *
 * A: 65
 * a: 97
 *
 * 两者相差：32
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        char letter = 'b';
        System.out.println("小写字母" + letter + "的大写为：" + (char)(letter - 32));
    }
}
