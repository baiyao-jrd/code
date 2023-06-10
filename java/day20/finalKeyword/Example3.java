package day20.finalKeyword;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/17:16
 * @Description:
 */
public class Example3 {
    public static void main(String[] args) {
        final int a = 1;
//        final修饰的变量不能被修改
//        a = 2;
    }
}

class Father {
    public final void method() {
        System.out.println("父类的final方法");
    }
}

class Child extends Father {
//    public final void method() {
//        System.out.println("子类不能继承父类final修饰的方法");
//    }
}

final class Base {

}

//子类不能继承太监类
//class Sub extends Base {
//
//}