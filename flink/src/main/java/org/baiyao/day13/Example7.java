package org.baiyao.day13;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/21:01
 * @Description:
 */
public class Example7 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add("x", "y"));
        System.out.println(add(1, "x"));
    }

    public static Object add(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (int)a + (int)b;
        } else if (a instanceof String && b instanceof String) {
            return a.toString() + b.toString();
        } else {
//            throw new RuntimeException("");
            return new Exception("输入参数类型有误");
        }
    }
}
