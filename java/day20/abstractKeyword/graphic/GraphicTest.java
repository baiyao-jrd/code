package day20.abstractKeyword.graphic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/17:30
 * @Description:    声明一个父类Graphic, 包含两个抽象方法
 *                  1) 计算面积: public abstract double area();
 *                  2) 返回信息: public abstract String detail();
 *
 *                  声明两个子类, 一个是矩形(Rectangle), 一个是圆形(Circle)
 *                  分别实现上面的抽象方法
 *
 *                  在本main方法中，创建一个Graphic类型的数组，里面存矩形和圆形的对象，
 *                  最后按照面积从小到大遍历输出每个图形的信息
 */
public class GraphicTest {
    public static void main(String[] args) {
        Graphic[] graphics = new Graphic[3];

        graphics[0] = new Circle(2);
        graphics[1] = new Rectangle(2, 3);
        graphics[2] = new Rectangle(8, 3);

        Arrays.sort(graphics, new Comparator<Graphic>() {
            @Override
            public int compare(Graphic a, Graphic b) {
                return (int)(-b.area() + a.area());
            }
        });

        for (Graphic graphic : graphics) {
            System.out.println(graphic.detail());
            System.out.println();
        }
    }
}
