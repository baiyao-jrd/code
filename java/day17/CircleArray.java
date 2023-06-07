package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/9:13
 * @Description:
 */
public class CircleArray {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
            circles[i].radius = i + 1;

            System.out.print(circles[i] + "\n");
        }
    }
}
