package day29.generics.caseDemo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/15:32
 * @Description:
 */
public class CaseTest {
    public static void main(String[] args) {
        Collection<Object> objects = new ArrayList<>();
        objects.add(new Circle(2.0));
        objects.add(new Rectangle(2.0, 3.0));
        objects.add("江润冬");

        printArea(objects);
    }

    private static <T> void printArea(Collection<T> objects) {
        for (T object : objects) {
            if (object instanceof Graphic) {
                System.out.println(object instanceof Rectangle ? (Rectangle)object : (Circle)object);
            }
        }
    }
}
