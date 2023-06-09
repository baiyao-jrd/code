package day19.initialize;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/17:10
 * @Description:
 */
public class InitializeTest2 {
    public static void main(String[] args) {
        SubCla sub = new SubCla();
        System.out.println("----------------------");
        SubCla cla = new SubCla(2);
    }
}

class BaseCla {
    public BaseCla() {
        System.out.println("父类构造器");
    }

    {
        System.out.println("父类初始化非静态代码块");
    }
}

class SubCla extends BaseCla {
    private int a = getNumber();

    public SubCla() {
        System.out.println("子类无参构造器");
    }

    {
        System.out.println("子类初始化非静态代码块");
        System.out.println("正在创建实例对象");
    }

    public SubCla(int a) {
        this.a = a;
        System.out.println("子类有参构造");
    }

    public int getNumber() {
        System.out.println("子类 -> getNumber -> a: " + a);
        return 1;
    }
}
