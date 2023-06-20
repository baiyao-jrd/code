package day29.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/22:11
 * @Description:
 */
public class JoinIfAbsentTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add(2);
        objects.add('a');

        joinIfAbsent(objects, "1");
        joinIfAbsent(objects, "2");

        for (Object object : objects) {
            System.out.print(object + " ");
        }
    }

    public static <T, U extends T> void joinIfAbsent(Collection<T> a, U b) {
        if (!a.contains(b)) {
            a.add(b);
        }
    }
}
