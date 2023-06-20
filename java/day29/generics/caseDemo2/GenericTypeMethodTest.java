package day29.generics.caseDemo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/20:31
 * @Description:
 */
public class GenericTypeMethodTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();

        strings.add("1");
        strings.add("2");
        strings.add("3");

        integers.add(1);
        integers.add(3);
        integers.add(2);

        integers2.add(1);
        integers2.add(3);
        integers2.add(2);

        System.out.println(disjoint(strings, integers));
        System.out.println(disjoint(integers2, integers));
    }

    public static <T, U> boolean disjoint(Collection<T> a, Collection<U> b) {
        for (T t : a) {
            for (U u : b) {
                if (t.equals(u)) {
                    return false;
                }
            }
        }
        return true;
    }
}
