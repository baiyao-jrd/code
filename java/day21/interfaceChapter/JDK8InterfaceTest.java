package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:34
 * @Description:
 */
public class JDK8InterfaceTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.method();
    }
}

class Super {
    public void method() {
        System.out.println("父类");
    }
}

interface Interface {
    static void method() {
        System.out.println("接口");
    }
}

class Sub extends Super implements Interface {

}