package day28.map;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/12:56
 * @Description:
 */
public class MapMethodTest {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "李四");
        hm.put("王", "二麻子");
        hm.put("顺利", "毕业");

        System.out.println(hm);

        System.out.println("键值对儿数量: " + hm.size());

        System.out.println("是否包含key -> '王': " + hm.containsKey("王"));
        System.out.println("是否包含value -> '麻子': " + hm.containsValue("麻子"));

        System.out.println("获取key -> 王, 对应的value -> 二麻子: " + hm.get("王"));

        System.out.println("获取没有的key: " + hm.get("江"));

        // 删除某个存在的key
        String 王 = hm.remove("王");
        System.out.println(王);

        // 删除某个不存在的key
        String 江 = hm.remove("江");

        System.out.println(江);

        System.out.println("现在的hashmap: " + hm);
    }
}
