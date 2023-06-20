package day29.generics.caseDemo3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/16:29
 * @Description:
 */
public class MyArraysTest {
    public static void main(String[] args) {
        ArrayList<Object> a = MyArrays.asList(1, 2, 3, "江润冬", 2.7);
        System.out.println(a);

        String[] str = {"a", "h", "d", "j", "c"};
        MyArrays.sort(str);

        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();

        MyArrays.reverse(str);

        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();

        Integer[] list = {1, 2, 4, 8, 3, 11, 2, 2, 1};

        MyArrays.swap(list, 0, 3);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
