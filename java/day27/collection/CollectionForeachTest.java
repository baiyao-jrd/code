package day27.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:56
 * @Description:
 */
public class CollectionForeachTest {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);

        for(Object obj : a) {
            System.out.print(obj + " ");
        }
    }
}
