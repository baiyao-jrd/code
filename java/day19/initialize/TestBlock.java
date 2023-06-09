package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/16:54
 * @Description:
 */
public class TestBlock {
    public static void main(String[] args) {
        Demo de = new Demo();
        System.out.println(de.getA());
        System.out.println("---------------------");

        Demo mo = new Demo(5);
        System.out.println(mo.getA());
    }
}

class Demo {
    private int a;

    {
        a = 1;
        System.out.println("非静态代码块");
    }

    public Demo() {
        System.out.println("无参构造");
    }

    public Demo(int a) {
        this.a = a;
        System.out.println("有参构造");
    }

    public int getA() {
        return a;
    }
}
