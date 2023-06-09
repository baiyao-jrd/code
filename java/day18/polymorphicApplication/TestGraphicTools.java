package day18.polymorphicApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:36
 * @Description:
 */
public class TestGraphicTools {
    public static void main(String[] args) {
        GraphicTools.showArea(new Circle(2));
        GraphicTools.showArea(new Rectangle(2.0, 3.0));
    }
}
