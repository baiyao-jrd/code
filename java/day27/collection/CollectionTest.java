package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:35
 * @Description:
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("lisi");
        arrayList.add(123);
        System.out.println("collection中的元素个数: " + arrayList.size());
    }
}
