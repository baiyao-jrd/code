package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/15:38
 * @Description: 类的非静态实例方法
 */
public class Person {
    String name;
    int age;

    public void eat() {
        if (age < 1) {
            System.out.println(name + "要喝奶了~");
        } else if (age > 80) {
            System.out.println(name + "要喝稀饭了~");
        } else {
            System.out.println(name + "要吃饭了~");
        }
    }
}
