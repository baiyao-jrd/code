package day27.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/10:58
 * @Description:
 */
public class CollectionIteratorTest {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        a.add(new Student(1, "江润冬"));
        a.add(new Student(2, "江明阳"));
        a.add(new Student(3, "江奇志"));
        a.add(new Student(3, "江奇志"));

        Iterator iterator = a.iterator();

        while (iterator.hasNext()) {

            Student next = (Student)iterator.next();

            System.out.print(next + " ");

            if (next.getId() == 3) {
                iterator.remove();
            }
        }

        System.out.println();

        for (Object o : a) {
            System.out.print(o + " ");
        }
    }
}
