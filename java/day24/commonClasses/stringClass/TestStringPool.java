package day24.commonClasses.stringClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/23:11
 * @Description:
 */
public class TestStringPool {
    public static void main(String[] args) {
        String a = "helloWorld";        // 常量池
        String b = "hello" + "World";   // "" + ""在常量池
        String c = "hello" + "world";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        final String d = "hello";
        final String e = "World";
        String f = d + e;               // final常量与final常量拼接的结果方在常量池

        String g = "hello";
        String h = "World";
        String i = (g + h).intern();    // 字符串.intern()的结果在常量池中

        System.out.println(a == b);
        System.out.println(a == f);
        System.out.println(a == i);

        System.out.println("*********************************************************");

        String j = g + h;
        String k = g + "World";

        String l = new String("hello");
        String m = l + "World";
        String n = String.valueOf(new char[]{'h','e','l','l','o','W','o','r','l','d'});
        String o = "hello".concat("World");

        System.out.println(a == j);
        System.out.println(a == k);
        System.out.println(a == m);
        System.out.println(a == n);
        System.out.println(a == o);
    }
}
