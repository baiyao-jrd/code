package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/17:39
 * @Description:
 */
public class InitializeTest3 {
    public static void main(String[] args) {
        SubNew s1 = new SubNew();
        System.out.println("--------------");
        SubNew s2 = new SubNew();
    }
}

class BaseNew {
    {
        System.out.println("父类非静态代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }
}

class SubNew extends BaseNew {
    {
        System.out.println("子类非静态代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }
}