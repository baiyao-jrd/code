package day28.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/13:07
 * @Description:
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "江润冬");
        map.put(1, "江明昊");
        map.put(2, "江明阳");
        map.put(3, "江奇志");

        System.out.println(map);

        Set<Integer> integers = map.keySet();
        System.out.print("key集: ");
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

        System.out.println();

        Collection<String> values = map.values();
        System.out.print("values集: ");
        for (String value : values) {
            System.out.print(value + " ");
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("键值对儿: ");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
    }
}
