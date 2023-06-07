package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/11:42
 * @Description:
 */
public class CircleThree {
    private double radius;

    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            System.out.println("半径参数输入无效~~");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
