package day30.generics;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/21/11:32
 * @Description:
 */
public class HashmapTest {
    public static void main(String[] args) {

        HashMap<Provice, ArrayList<City>> map = new HashMap<>();

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(11, "北京市", 1));

        ArrayList<City> cities1 = new ArrayList<>();
        cities1.add(new City(21, "海口市", 2));
        cities1.add(new City(22, "三亚市", 2));

        map.put(new Provice(1, "北京市"), cities);
        map.put(new Provice(2, "海南省"), cities1);

        Set<Map.Entry<Provice, ArrayList<City>>> entries = map.entrySet();
        Iterator<Map.Entry<Provice, ArrayList<City>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
