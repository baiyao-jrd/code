package day29.generics.caseDemo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/19:23
 * @Description:    某方法可处理两个Collection集合, 可将src集合中的元素剪切到dest集合中
 */
public class WildCardSuperTest {
    public static void main(String[] args) {
        ArrayList<Graphic> graphics = new ArrayList<>();

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(1.5));

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1.0, 3.9));
        rectangles.add(new Rectangle(2.0, 4.5));

        System.out.println(cutcopy(graphics, circles));
        System.out.println(cutcopy(graphics, rectangles));

        for (Graphic graphic : graphics) {
            System.out.println(graphic);
        }

    }

    public static <T> T cutcopy(Collection<? super T> destination, Collection<T> source) {
        Iterator<T> iterator = source.iterator();
        T lastElement = null;

        while (iterator.hasNext()) {
            T next = iterator.next();
            lastElement = next;
            destination.add(next);
        }

        return lastElement;
    }
}
