package day19.graphicObjectManagement;
import static java.lang.Math.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/15:03
 * @Description:
 */
public class Circle extends Graphic{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public double area() {
        return PI * pow(radius, 2);
    }

    public String detail() {
        return super.detail() + ", 半径: " + radius;
    }
}
