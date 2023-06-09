package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:41
 * @Description:
 */
public class TestDownCasting {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.eat();

//        注意这里一定要在最外层括一层括号
        ((Cat)animal).catchMouse();
    }
}
