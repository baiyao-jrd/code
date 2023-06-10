package day20.abstractKeyword.graphic;
import static java.lang.Math.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/17:40
 * @Description:
 */
public class Circle extends Graphic{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public String detail() {
        return "半径: " + radius + ", 面积: " + area();
    }
}
