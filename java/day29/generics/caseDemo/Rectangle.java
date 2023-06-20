package day29.generics.caseDemo;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:33
 * @Description:
 */
public class Rectangle implements Comparable<Rectangle> {
    private final Double length;
    private final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double area() {
        return length * width;
    }

    @Override
    public int compareTo(@NotNull Rectangle o) {
        return Double.compare(area(), o.area());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + "" +
                ", area=" + area() +
                '}';
    }
}
