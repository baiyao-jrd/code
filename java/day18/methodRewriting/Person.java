package day18.methodRewriting;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/21:00
 * @Description:
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String detail() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}
