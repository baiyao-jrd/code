package day29.generics.caseDemo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/15:29
 * @Description:
 */
public class Circle extends Graphic {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "" +
                ", area()=" + getArea() +
                '}';
    }
}
