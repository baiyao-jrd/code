package day29.generics.caseDemo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/17:59
 * @Description:
 */
public class WildCardExtendsTest {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(1.0));
        printArea(circles);

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1.0, 2.0));
        rectangles.add(new Rectangle(2.0, 1.5));
        printArea(rectangles);

        ArrayList<Graphic> objects = new ArrayList<>();
        objects.add(new Rectangle(1.0, 2.5));
        objects.add(new Circle(2.0));
        printArea(objects);
    }

    private static void printArea(Collection<? extends Graphic> col) {
        for (Graphic graphic : col) {
            System.out.print(graphic.getArea() + " ");
        }
        System.out.println();
    }
}
