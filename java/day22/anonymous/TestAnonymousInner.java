package day22.anonymous;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/12/18:40
 * @Description:
 */
public class TestAnonymousInner {
    public static void main(String[] args) {
        new Object() {
            public void method() {
                System.out.println("匿名内部类的方法");
            }
        }.method();

        System.out.println("----------------------------------------------");

        new inter() {
            @Override
            public void method() {
                System.out.println("重写父接口的method方法");
            }

            @Override
            public void fun() {
                System.out.println("重写父接口的fun方法");
            }
        }.method();
    }
}

interface inter {
    void method();
    void fun();
}