package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:38
 * @Description:
 */
public class CollectionAddAllTest {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add("江润冬");
        arrayList.add(2);

        System.out.println("元素个数: " + arrayList.size());

        Collection array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);

        arrayList.addAll(array);

        System.out.println("元素个数: " + arrayList.size());
    }
}
