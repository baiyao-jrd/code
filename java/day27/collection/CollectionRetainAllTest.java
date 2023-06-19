package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:51
 * @Description:    只保留两个集合的交集
 */
public class CollectionRetainAllTest {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        Collection b = new ArrayList();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add("江润冬");
        a.add("江润冬");
        a.add("江明阳");

        b.add(1);
        b.add(2);
        b.add("江润冬");
        b.add("江润冬");

        a.retainAll(b);

        for (Object o : a) {
            System.out.print(o + " ");
        }
    }
}
