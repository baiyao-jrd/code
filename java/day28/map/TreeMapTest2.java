package day28.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:15
 * @Description:
 */
public class TreeMapTest2 {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareToIgnoreCase(b);
            }
        });

        map.put("aili", 12000d);
        map.put("sundai", 8000d);
        map.put("Mani", 60000d);
        map.put("Basi", 50000d);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
