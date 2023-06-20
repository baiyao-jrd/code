package day28.map;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/17:09
 * @Description:
 */
public class ConcurrentModificationExecptionTest {
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");

        for (Object o : list) {
            if ("a".equals(String.valueOf(o))) {
                // ConcurrentModificationException -> 迭代的同时, 无法修改集合
                list.add("d");
            }
        }
    }
}