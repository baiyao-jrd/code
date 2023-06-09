package day19.graphicObjectManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/16:07
 * @Description:    企业面试题
 */
public class Method {
    public static void main(String[] args) {
        Base base = new Sub();

        base.method(new Son());
    }
}

class Father {}

class Son extends Father {}

class Base {
    public void method(Father father) {
        System.out.println("Base");
    }
}

class Sub extends Base {
    public void method(Son son) {
        System.out.println("Son");
    }
}
