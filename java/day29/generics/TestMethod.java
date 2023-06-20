package day29.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/13:39
 * @Description:
 */
public class TestMethod {
    public static void main(String[] args) {
        String[] arr = {"江明阳", "江润冬", "江奇志"};

        Collection<String> strings = new ArrayList<>();

        fromArrayToCollection(arr, strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void fromArrayToCollection(Object[] arr, Collection<String> strings) {
        for (Object o : arr) {
            strings.add((String) o);
        }
    }


}
