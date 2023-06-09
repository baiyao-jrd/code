package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/16:27
 * @Description:
 */
public class ClassInitializeTest2 {
    public static void main(String[] args) {
        Son.test();

        System.out.println("----------------------------");

        Son.test();
    }
}

class Father {
    protected static int num;
    protected static int a = getNumber();

    static {
        System.out.println("Father -> a: " + a);
    }

    public static int getNumber() {
        System.out.println("Father -> getNumber -> a: " + a);
        return ++num;
    }
}

class Son extends Father {
    public static int b = getNumber();

    static {
        System.out.println("Son -> b: " + b);
    }

    public static int c = getNumber();

    static {
        System.out.println("Son -> b: " + b + ", c: " + c);
    }

    public static int getNumber() {
        System.out.println("Son -> getNumber -> a: " + a + ", b: " + b + ", c: " + c);
        return ++num;
    }

    public static void test() {
        System.out.println("Son -> test -> a: " + b + ", c: " + c);
    }
}
