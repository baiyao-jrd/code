package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/10:26
 * @Description: 矩形类构造器的设计
 *
 *                  所有矩形都有长宽的属性值，也都有求面积、周长和获取矩形对象的详细信息的功能需求
 */
public class Rectangle {
    int height;
    int length;

    public Rectangle() {
    }

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    int area() {
        return height * length;
    }

    int perimeter() {
        return 2 * (height + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
