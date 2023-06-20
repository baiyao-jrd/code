package day29.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/13:50
 * @Description:
 */
public class TestMethod2 {
    public static void main(String[] args) {
        String[] a = {"江润冬", "江明阳", "江奇志"};
        Collection<String> b = new ArrayList<>();

        fromArrayToCollection(a, b);

        for (String s : b) {
            System.out.print(s + "\t");
        }

        Integer[] c = {1, 2, 3, 5, 7};
        ArrayList<Integer> d = new ArrayList<>();

        fromArrayToCollection(c, d);

        for (Integer integer : d) {
            System.out.print(integer + " ");
        }

    }

    public static <T> void fromArrayToCollection(T[] a, Collection<T> b) {
        for (T t : a) {
            b.add(t);
        }
    }
}
