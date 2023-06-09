package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:50
 * @Description:
 */
public class Dog extends Animal {
    public void eat() {
        System.out.println("狗也会吃~~");
    }

    public void watchHouse() {
        System.out.println("狗会看门~~");
    }
}
