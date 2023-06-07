package day13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/17:25
 * @Description: 成员变量的默认值
 */
public class TestChinese {
    public static void main(String[] args) {
        Chinese zs = new Chinese();
        Chinese ls = new Chinese();

        Chinese.country = "中国";

        zs.name = "张三";
        zs.age = 21;

        ls.name = "李四";
        ls.age = 22;

        printInfo(zs);
        printInfo(ls);

        //1. 修改成员变量以及静态变量
        ls.name = "lisi";
        ls.country = "美国";

        printInfo(zs);
        printInfo(ls);
    }

    private static void printInfo(Chinese name) {
        System.out.println(name.name + ", " + name.age + ", 是个" + name.country + "人！");
    }
}

/**
 * 张三, 21, 是个中国人！
 * 李四, 22, 是个中国人！
 * 张三, 21, 是个美国人！
 * lisi, 22, 是个美国人！
 */
