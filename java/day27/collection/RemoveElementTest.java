package day27.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/11:13
 * @Description:
 */
public class RemoveElementTest {
    public static void main(String[] args) {
        Collection a = new ArrayList();

        for (int i = 0; i < 15; i++) {
            a.add(new Random().nextInt(100));
        }

        System.out.print("集合中的元素有: ");
        for (Object o : a) {
            System.out.print(o + " ");
        }
        System.out.println();

        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            if ((int)iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.print("集合中的元素有: ");
        for (Object o : a) {
            System.out.print(o + " ");
        }
    }
}
