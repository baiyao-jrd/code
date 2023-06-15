package day24.commonClasses.stringClass;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/23:01
 * @Description:
 */
public class TestCreateString {
    public static void main(String[] args) {
        String a = new String("s");
        String b = String.valueOf('b');
        String c = "ni";
        String d = 521 + "";
        String e = new Date().toString();

        System.out.println(a + " -> " + b + " -> " + c + " -> " + d + " -> " + e);

        String f = "baiYao";
        String g = "baiYao";

        // f和g指向了常量池中同一个字符串对象
        System.out.println(f == g);

        String h = new String("niHao");
        String i = new String("niHao");
        String j = "niHao";

        System.out.println(h == i);
        System.out.println(j == i);
    }
}
