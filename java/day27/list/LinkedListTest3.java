package day27.list;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/14:37
 * @Description:
 */
public class LinkedListTest3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());

        // 队空后, 返回null
        System.out.println(linkedList.pollFirst());
    }
}
