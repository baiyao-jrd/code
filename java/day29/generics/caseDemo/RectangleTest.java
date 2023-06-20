package day29.generics.caseDemo;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:55
 * @Description:
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(1.5d, 2.0d);
        rectangles[1] = new Rectangle(1.5d, 3.0d);
        rectangles[2] = new Rectangle(1.0d, 1.0d);

        Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
