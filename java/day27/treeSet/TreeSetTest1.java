package day27.treeSet;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/16:18
 * @Description:
 */
public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("d");
        treeSet.add("b");
        treeSet.add("e");
        treeSet.add("c");

        System.out.println("元素个数: " + treeSet.size());

        for (Object o : treeSet) {
            System.out.print(o + " ");
        }
    }
}
