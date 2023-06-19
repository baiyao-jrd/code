package day27.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/16:39
 * @Description:
 */
public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher a, Teacher b) {
                return a.getId() - b.getId();
            }
        });

        teachers.add(new Teacher(1, "张三"));
        teachers.add(new Teacher(5, "张五"));
        teachers.add(new Teacher(6, "张六"));
        teachers.add(new Teacher(4, "张七"));
        teachers.add(new Teacher(6, "张七"));
        teachers.add(new Teacher(3, "张八"));
        teachers.add(new Teacher(2, "张九"));

        System.out.println("元素个数: " + teachers.size());

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
