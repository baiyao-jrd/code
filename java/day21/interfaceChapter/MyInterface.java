package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:22
 * @Description:
 */
public interface MyInterface {
    void fun();

    static void method() {
        System.out.println("接口中的静态方法");
    }

    default void solution() {
        System.out.println("接口中的默认方法");
    }
}
