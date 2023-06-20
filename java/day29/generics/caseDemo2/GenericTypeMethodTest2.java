package day29.generics.caseDemo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/22:02
 * @Description:
 */
public class GenericTypeMethodTest2 {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Graphic> graphics = new ArrayList<>();

        circles.add(new Circle(1.0));
        circles.add(new Circle(2.0));

        rectangles.add(new Rectangle(1.0, 2.5));
        rectangles.add(new Rectangle(2.0, 1.5));

        graphics.add(new Circle(4.0));
        graphics.add(new Rectangle(1.5, .2));

        printArea(circles);
        printArea(rectangles);
        printArea(graphics);
    }

    private static <T extends Graphic> void printArea(Collection<T> coll) {
        for (T t : coll) {
            System.out.println(t.getArea());
        }
    }
}
