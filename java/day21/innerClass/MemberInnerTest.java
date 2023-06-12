package day21.innerClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/17:08
 * @Description:
 */
public class MemberInnerTest {
    public static void main(String[] args) {
        //  内部类的使用依赖于外部类对象
        new Outer().new Inner1().method();

        //  两种情况
        new Outer.Inner2().method();

        Outer.Inner2.fun();

        new Outer().getInner1().method();
    }
}
