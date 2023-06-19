package day27.set;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:37
 * @Description:
 */
public class HashSetClass {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add("张三");
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");

        System.out.println("hashSet元素个数: " + hashSet.size());

        for (Object o : hashSet) {
            System.out.print(o + " " );
        }
    }
}
