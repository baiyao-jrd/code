package day27.list;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/11:39
 * @Description:
 */
public class ListAddTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("张三");
        a.add(0, "zhangsan");
        a.add(1, "李四");

        for (Object o : a) {
            System.out.print(o + " ");
        }

        // 获取指定位置的元素
        System.out.println(a.get(2));

        // 获取元素索引位置
        System.out.println(a.indexOf("王五"));
        System.out.println(a.indexOf("zhangsan"));

        // 删除指定位置的元素
        a.remove("张三");
        a.remove(0);

        for (Object o : a) {
            System.out.print(o + " ");
        }
    }
}
