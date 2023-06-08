package day18.constructor02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:45
 * @Description:
 */
public class Person {
    private String name;
    private int age;

//    public Person() {
//        System.out.println("父类无参构造器");
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造器");
    }
}
