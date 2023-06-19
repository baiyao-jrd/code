package day27.treeSet;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/16:28
 * @Description:
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(1, "江润冬"));
        students.add(new Student(2, "江明阳"));
        students.add(new Student(1, "江润冬"));
        students.add(new Student(4, "王大妮"));
        students.add(new Student(3, "江奇志"));
        students.add(new Student(3, "王大妮"));

        System.out.println("元素个数: " + students.size());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
