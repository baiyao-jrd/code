package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:46
 * @Description:    删除两个集合的交集 & 只保留两个集合的交集
 */
public class CollectionRemoveAllTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);

        System.out.println("元素个数: " + collection.size());

        Collection list = new ArrayList();

        list.add(1);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(8);

        collection.removeAll(list);

        System.out.println("元素个数: " + collection.size());

        for (Object o : collection) {
            System.out.print(o + " ");
        }
    }
}
