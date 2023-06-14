package day23.annotate.heavyLoad;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/11:42
 * @Description:
 */
public class TestOverride {
    public static void main(String[] args) {
        Son son = new Son();
        son.method("");
        son.method(new Object());
    }
}

class Father {
    public void method(Object obj) {
        System.out.println("父类");
    }
}

class Son extends Father {
    public void method(String ob) {
        System.out.println("子类");
    }
}