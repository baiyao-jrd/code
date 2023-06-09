package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:51
 * @Description:
 */
public class TestDownCasting3 {
    public static void main(String[] args) {
        takeCare(new Cat());
        System.out.println("----------------------------");
        takeCare(new Dog());
    }

    public static void takeCare(Animal animal) {
        animal.eat();

        if (animal instanceof Cat) {
            ((Cat)animal).catchMouse();
        } else if (animal instanceof Dog) {
            ((Dog)animal).watchHouse();
        }
    }
}
