package day18.polymorphicApplication;
import static java.lang.Math.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/22:34
 * @Description:
 */
public class Circle extends Graphic {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * pow(radius, 2);
    }
}
