package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/18:06
 * @Description: 圆类 -> 计算周长、计算面积、
 *                   -> 描述半径、周长、面积
 */
public class Circle {
    Double radius;

    Double perimeter() {
        return radius * 2 * Math.PI;
    }

    Double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    String detail() {
        return "圆的半径：" + radius + ", 周长：" + perimeter() + ", 面积：" + area();
    }
}
