package day13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/17:16
 * @Description: 成员变量的访问
 */
public class TestChineseField {
    public static void main(String[] args) {
        //1. 静态变量可以直接类名调用
        System.out.println("国籍: " + Chinese.country + ", 类: " + Chinese.class);
        System.out.println("--> " + Chinese.class);

        //2. 实例变量不可以直接类名调用，必须要通过new的实例进行调用
        Chinese zhiNa = new Chinese();

        System.out.println("国籍: " + zhiNa.country + ", 姓名: " + zhiNa.name + ", 年龄: " + zhiNa.age);
    }
}
