package day30.generics.demoCase2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/12:38
 * @Description:
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("baiYao");
        strings.add("java");
        strings.add("HTML5");
        strings.add("javaScript");
        strings.add("bigData");

        System.out.print("排序之前: ");

        for (String string : strings) {
            System.out.print(string + " ");
        }

        System.out.println();

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.print("排序之后: ");

        for (String string : strings) {
            System.out.print(string + " ");
        }

        System.out.println();

        System.out.println("最长的单词: " + shuffle(strings));

        System.out.print("乱序之后: ");

        for (String string : strings) {
            System.out.print(string + " ");
        }

        System.out.println();

    }

    public static <T extends String> String shuffle(ArrayList<T> list) {
        Collections.shuffle(list);
        return Collections.max(list, new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                return a.length() - b.length();
            }
        });
    }

    public static <T> void swap(ArrayList<T> list, int i, int j) {
        System.out.println("***");
        T t = list.get(j);
        list.add(j, list.get(i));
        list.add(i, t);
    }
}
