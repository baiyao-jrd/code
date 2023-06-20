package day29.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:02
 * @Description:
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "江明阳");
        map.put(2, "江润冬");

        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next + " -> " + map.get(next));
        }
    }
}
