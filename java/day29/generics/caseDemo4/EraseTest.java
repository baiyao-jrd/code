package day29.generics.caseDemo4;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/23:50
 * @Description:
 */
public class EraseTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("尚硅谷");
        arrayList.add(2);

        Object o = arrayList.get(0);
        Object p = arrayList.get(1);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        Student a = new Student("江明阳", 20000d);
        Number score = a.getScore();
    }
}

class Student<T extends Number & java.io.Serializable> {
    private String name;
    private T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public T getScore() {
        return score;
    }
}
