package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/16:19
 * @Description:
 */
public class ClassInitializeTest1 {
    public static void main(String[] args) {
        Sub su = new Sub();
        System.out.println("-------------");
        Sub sb = new Sub();
    }
}

class Base {
    static {
        System.out.println("Base类的静态代码块");
    }
}

class Sub extends Base {
    static {
        System.out.println("Sub类的静态代码块");
    }
}
