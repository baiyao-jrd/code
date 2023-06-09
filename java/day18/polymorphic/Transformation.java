package day18.polymorphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:39
 * @Description:
 */
public class Transformation {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat)animal;

        System.out.println(cat);
    }
}
