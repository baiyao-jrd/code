package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:41
 * @Description:
 */
public class CollectionRemoveTest {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("江润冬");
        list.add("江明阳");
        list.add("江奇志");
        list.add("王大妮");
        list.add("江润冬");

        System.out.println("元素个数: " + list.size());

        list.remove("江润冬");

        System.out.println("元素个数: " + list.size());

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
