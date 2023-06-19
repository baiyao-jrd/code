package day27.list;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/14:30
 * @Description:
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("江润冬");
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        for (Object o : linkedList) {
            System.out.print(o + " ");
        }
    }
}
