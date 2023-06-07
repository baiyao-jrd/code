package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/12:00
 * @Description:
 */
public class RectangleNew {
    private double length;
    private double height;

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("长度无效");
        }
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("宽度无效");
        }
    }

    public double getHeight() {
        return height;
    }

    public RectangleNew() {
    }

    public RectangleNew(double length, double height) {
        if (length > 0 && height > 0) {
            this.length = length;
            this.height = height;
        } else {
            System.out.println("输入参数无效");
        }
    }

    public double area() {
        return length * height;
    }

    public double perimeter() {
        return 2 * (length + height);
    }

    @Override
    public String toString() {
        return "RectangleNew{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}