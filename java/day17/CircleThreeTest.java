package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/11:46
 * @Description:
 */
public class CircleThreeTest {
    public static void main(String[] args) {
        CircleThree circleThree = new CircleThree();

        circleThree.setRadius(-1.0);

        System.out.println(circleThree.area());

        circleThree.setRadius(2);

        System.out.println(Math.round(circleThree.area()));
    }
}
