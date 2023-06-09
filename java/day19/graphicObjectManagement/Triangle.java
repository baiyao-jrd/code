package day19.graphicObjectManagement;
import static java.lang.Math.*;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/15:36
 * @Description:
 */
public class Triangle extends Graphic {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double flag = perimeter() / 2;

        return sqrt(flag * (flag - sideA) * (flag - sideB) * (flag - sideC));
    }

    public String detail() {
        return super.detail() + ", A边: " + sideA + ", B边: " + sideB + ", C边: " + sideC;
    }
}
