package day28.generics;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/19/17:15
 * @Description:    没有泛型的话, 会引起的问题
 */
public class ClassCastException {
    public static void main(String[] args) {
        // stringList里面不小心装入Integer
        ArrayList arrayList = new ArrayList();

        arrayList.add("江润冬");
        arrayList.add("江明阳");
        arrayList.add("江奇志");

        arrayList.add(123);

        for (Object o : arrayList) {
            // Integer cannot be cast to String
            System.out.print(((String) o).length() + "\t");
        }
    }
}
