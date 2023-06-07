package day13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/17:04
 * @Description: 创建两个Person实例对象，并为其属性各自赋值，最后调用一下相应的方法
 */
public class TestOOP {
    public static void main(String[] args) {
        Person zhangSan = new Person();
        Person liSi = new Person();

        zhangSan.name = "张三";
        zhangSan.age = 21;
        zhangSan.gender = '男';

        System.out.println(zhangSan.name + ", " + zhangSan.gender + ", " + zhangSan.age + "岁~");

        liSi.name = "李四";
        liSi.age = 22;
        liSi.gender = '女';

        System.out.println(liSi.name + ", " + liSi.gender + ", " + liSi.age + "岁~");

        zhangSan.eat();

        liSi.eat();
    }
}
