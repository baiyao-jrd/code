package day27.list;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/14:31
 * @Description:
 */
public class LinkedListTest2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        for (Object o : linkedList) {
            System.out.print(o + " ");
        }

        System.out.println();

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());

        // NoSuchElementException -> 栈空, 报异常
        System.out.println(linkedList.removeFirst());
    }
}
