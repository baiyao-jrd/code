package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:44
 * @Description:
 */
public class TestDownCasting2 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.a);
        System.out.println(((Sub)base).a);

        Sub sub = new Sub();
        System.out.println(sub.a);
        System.out.println(((Base)sub).a);
    }
}

class Base {
    int a = 1;
}

class Sub extends Base {
    int a = 2;
}
