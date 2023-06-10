package day20.abstractKeyword.graphic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/17:35
 * @Description:
 */
public class Rectangle extends Graphic{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String detail() {
        return "长: " + length + ", 宽: " + width + ", 面积: " + area();
    }
}
