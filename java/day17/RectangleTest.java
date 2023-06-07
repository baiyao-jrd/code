package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/11:34
 * @Description:
 */
public class RectangleTest {
    public static void main(String[] args) {
        System.out.println(new Rectangle(1, 2));

        Rectangle rectangle = new Rectangle();
        rectangle.height = 1;
        rectangle.length = 3;

        System.out.println(rectangle);
    }
}
