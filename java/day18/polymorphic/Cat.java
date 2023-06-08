package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/22:18
 * @Description:
 */
public class Cat extends Animal {
    public void eat() {
        System.out.println("猫也会吃~~");
    }

    public void catchMouse() {
        System.out.println("猫会捉老鼠~~");
    }
}
