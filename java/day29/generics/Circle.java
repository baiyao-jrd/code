package day29.generics;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:18
 * @Description:
 */
public class Circle implements Comparable<Circle> {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(@NotNull Circle o) {
//        return Integer.parseInt(String.valueOf(radius - o.radius));
        return Double.compare(radius, o.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
