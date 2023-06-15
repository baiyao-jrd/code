package day24.commonClasses.objectClass.getClassMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/16:09
 * @Description:
 */
public class GetClassTest {
    public static void main(String[] args) {
        listen(new Dog());
        listen(new Cat());
    }

    public static void listen(Animal animal) {
        System.out.print("这是一只" + animal.getClass());
        animal.shut();
    }
}

abstract class Animal { public abstract void shut(); }

class Dog extends Animal {

    @Override
    public void shut() {
        System.out.println("汪汪");
    }
}

class Cat extends Animal {

    @Override
    public void shut() {
        System.out.println("喵喵");
    }
}
