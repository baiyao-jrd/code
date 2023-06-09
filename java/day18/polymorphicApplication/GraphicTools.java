package day18.polymorphicApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/09/14:34
 * @Description:    图形工具类 -> 可以查看各种图形的面积
 */
public class GraphicTools {
    public static void showArea(Graphic graphic) {
        System.out.println("该图形的面积: " + graphic.area());
    }
}
