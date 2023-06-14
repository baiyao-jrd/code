package day23.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/22:06
 * @Description:
 */
public class ClassCastException {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // Animal cannot be cast to Cat
        Cat cat = (Cat)animal;

        Animal dog = new Dog();

        // Dog cannot be cast Cat
        Cat catty = (Cat)dog;

    }
}

class Animal {}

class Cat extends Animal {}

class Dog extends Animal {}
