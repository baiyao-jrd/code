package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/17:54
 * @Description:    求三角形的面积
 */
public class TriangleArea {
    public static Double triangle(Double base, Double height) {
        if (base <= 0 || height <= 0) {
            System.out.println("参数错误！");
            return 0.0;
        }

        return base * height / 2;
    }

    public static Double triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("参数有误");
            return 0.0;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("参数有误");
            return 0.0;
        }
        double temp = (a + b + c) / 2;

        return Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
    }
}
