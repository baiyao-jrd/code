package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:28
 * @Description:
 */
public class MyInterfaceTest {
    public static void main(String[] args) {
        // 调用接口中的静态方法
        MyInterface.method();

        MyImpl my = new MyImpl();
        // 调用接口的抽象方法
        my.fun();
        // 调用接口的默认方法，执行的是实现类重写的方法
        my.solution();
    }
}
