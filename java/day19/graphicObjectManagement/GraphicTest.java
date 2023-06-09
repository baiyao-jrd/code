package day19.graphicObjectManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/15:45
 * @Description:
 */
public class GraphicTest {
    public static void main(String[] args) {
        Graphic[] graphics = new Graphic[4];
        graphics[0] = new Circle(2.0);
        graphics[1] = new Rectangle(2.0, 2.0);
        graphics[3] = new Rectangle(1.0, 4.0);
        graphics[2] = new Triangle(3, 4, 5);

        for (int i = 0; i < graphics.length - 1; i++) {
            for (int j = i + 1; j < graphics.length; j++) {
                if (graphics[i].area() > graphics[j].area() || (graphics[i].area() == graphics[j].area() && graphics[i].perimeter() > graphics[j].perimeter())) {
                    Graphic graphic;
                    graphic = graphics[j];
                    graphics[j] = graphics[i];
                    graphics[i] = graphic;
                }
            }
        }

        for (Graphic graphic : graphics) {
            System.out.println(graphic.detail());
        }
    }
}
