package day21.innerClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/16:56
 * @Description:
 */
public class Outer {
    private static int a;
    private int b;

    // 非静态内部类
    class Inner1 {
        private int c;

        public void method() {
            System.out.println("非静态内部类的非静态方法");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

    // 静态内部类
    static class Inner2 {
        public void method() {
            System.out.println("静态内部类的非静态方法");
            System.out.println(a);
//            System.out.println(b);  // 静态内部类中无法引用外部类的非静态成员
        }

        public static void fun() {
            System.out.println("静态内部类的静态方法");
            System.out.println(a);
//            System.out.println(b);  //编译报错，同上
        }
    }

    public void test() {
        //  直接使用内部非静态类
        Inner1 inner1 = new Inner1();
        System.out.println(inner1.c);
        inner1.method();

        //  method需要对象才能被引用
        new Inner2().method();

        Inner2.fun();
    }

    public Inner1 getInner1() {
        return new Inner1();
    }
}
