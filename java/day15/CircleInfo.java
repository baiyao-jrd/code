package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/18:12
 * @Description:
 */
public class CircleInfo {
    public static void main(String[] args) {
        Circle circleA = new Circle();
        circleA.radius = 2d;

        Circle circleB = new Circle();
        circleB.radius = 3d;

        System.out.println(circleA.detail());
        System.out.println(circleB.detail());
    }
}
