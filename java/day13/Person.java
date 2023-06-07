package day13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/16:57
 * @Description: 定义类
 */
public class Person {
    String name;
    int age;
    char gender;

    void eat() {
        if (age < 1) {
            System.out.println(name + ", 性别: " + gender + ", 喝奶~");
        } else if (age > 80) {
            System.out.println(name + ", 性别: " + gender + ", 喝稀饭~~");
        } else {
            System.out.println(name + ", 性别: " + gender + ", 吃饭~~~");
        }
    }
}
