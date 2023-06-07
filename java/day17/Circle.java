package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/9:06
 * @Description:
 */
public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", area=" + Math.round(area()) + ", perimeter()=" + Math.round(perimeter()) +
                '}';
    }
}
