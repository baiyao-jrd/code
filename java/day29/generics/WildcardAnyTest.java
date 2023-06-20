package day29.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/17:24
 * @Description:        两集合没有交集的话, 返回true
 */
public class WildcardAnyTest {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        ArrayList<String> b = new ArrayList<>();
        b.add("1");
        b.add("2");
        b.add("3");

        ArrayList<String> c = new ArrayList<>();
        c.add("3");
        c.add("2");
        c.add("1");

        ArrayList<Integer> d = new ArrayList<>();
        d.add(3);
        d.add(2);
        d.add(1);

        ArrayList<Integer> e = new ArrayList<>();
        e.add(3);
        e.add(2);
        e.add(1);

        System.out.println(disjoint(a, b));
        System.out.println(disjoint(a, c));
        System.out.println(disjoint(b, c));
        System.out.println(disjoint(d, e));
    }

    private static boolean disjoint(Collection<?> a, Collection<?> b) {
        for (Object o : a) {
            for (Object p : b) {
                if (o.equals(p)) {
                    return false;
                }
            }
        }
        return true;
    }
}
