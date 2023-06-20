package day28.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:11
 * @Description:
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();

        map.put("aili", 12000d);
        map.put("sundai", 8000d);
        map.put("Mani", 60000d);
        map.put("Basi", 50000d);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
