package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/17:03
 * @Description:
 */
public class InitializeTest1 {
    public static void main(String[] args) {
        SubClass su = new SubClass();
        System.out.println("------------------");
        SubClass sb = new SubClass();
    }
}

class BaseClass {
    {
        System.out.println("父类非静态代码块");
    }

    public BaseClass() {
        System.out.println("父类构造器");
    }
}

class SubClass extends BaseClass {
    {
        System.out.println("子类非静态代码块");
    }

    public SubClass() {
        super();
        System.out.println("子类无参构造器");
    }
}


