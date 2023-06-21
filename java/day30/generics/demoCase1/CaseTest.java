package day30.generics.demoCase1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/12:30
 * @Description:
 */
public class CaseTest {
    public static void main(String[] args) {
        TreeMap<Provice, TreeSet<City>> map = new TreeMap<>();

        TreeSet<City> a = new TreeSet<>();
        a.add(new City(11, "北京市", 1));

        TreeSet<City> b = new TreeSet<>();
        b.add(new City(21, "海口市", 2));
        b.add(new City(22, "三亚市", 2));

        map.put(new Provice(1, "北京市"), a);
        map.put(new Provice(2, "海南省"), b);

        Iterator<Map.Entry<Provice, TreeSet<City>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
