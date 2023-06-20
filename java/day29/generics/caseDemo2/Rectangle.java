package day29.generics.caseDemo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/15:30
 * @Description:
 */
public class Rectangle extends Graphic {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + "" +
                ", getArea()=" + getArea() +
                '}';
    }
}
