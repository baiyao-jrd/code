package day19.graphicObjectManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/15:03
 * @Description:
 */
public class Graphic {
    public Graphic() {
        System.out.println("父类无参构造器~");
    }

    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    public String detail() {
        return "周长: " + perimeter() + ", 面积: " + area();
    }
}
