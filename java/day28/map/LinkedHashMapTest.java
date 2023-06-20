package day28.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:07
 * @Description:
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();

        map.put("江润冬", 10000d);
        map.put("江明阳", 20000d);
        map.put(null, null);
        map.put("江奇志", 5000d);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
