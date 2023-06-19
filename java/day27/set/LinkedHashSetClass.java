package day27.set;

import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:39
 * @Description:
 */
public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();

        lh.add("张三");
        lh.add("张三");
        lh.add("张三");
        lh.add("李四");
        lh.add("王二麻子");

        lh.add(5);

        for (Object o : lh) {
            System.out.print(o + " ");
        }
    }
}
