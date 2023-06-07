package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/12:09
 * @Description:
 */
public class RectangleNewTest {
    public static void main(String[] args) {
        RectangleNew rectangleNew = new RectangleNew();
        rectangleNew.setLength(1);
        rectangleNew.setHeight(-2);

        System.out.println(rectangleNew);

        System.out.println(new RectangleNew(-1, 3));
    }
}
