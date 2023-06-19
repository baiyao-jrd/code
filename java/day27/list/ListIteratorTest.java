package day27.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:04
 * @Description:
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(new Student(1, "江润冬"));
        list.add(new Student(2, "江明阳"));
        list.add(new Student(3, "江奇志"));
        list.add(new Student(4, "王大妮"));
        list.add(new Student(5, "江流儿"));
        list.add(new Student(6, "江泽民"));

        ListIterator listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
        }
    }
}
