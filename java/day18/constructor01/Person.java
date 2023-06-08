package day18.constructor01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/20:35
 * @Description:    构造器不能被继承
 */
public class Person {
    private String name;

    public Person() {
        System.out.println("父类的无参构造器~~");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("父类的有参构造器~~");
    }

    public void setName(String name) {
        this.name = name;
    }
}
