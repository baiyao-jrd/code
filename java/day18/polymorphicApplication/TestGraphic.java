package day18.polymorphicApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/22:42
 * @Description:
 */
public class TestGraphic {
    public static void main(String[] args) {
        Graphic[] graphics = new Graphic[3];

        graphics[0] = new Circle(2);
        graphics[1] = new Rectangle(1, 2);
        graphics[2] = new Rectangle(3, 2);

        for (Graphic graphic : graphics) {
            System.out.println(graphic.area());
        }
    }
}
