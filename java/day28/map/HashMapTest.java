package day28.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/14:02
 * @Description:
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("江奇志", 30000d);
        map.put(null, null);
        map.put("江润冬", 10000d);
        map.put("江明阳", 20000d);
        map.put(null, 50000d);

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
