package day24.throwKeywords.DemoCase;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/10:26
 * @Description:
 */
public class GraphicTools {
    public static void printRectangle(int line, int column, char sign) {
        if (line < 0) { throw new IllegalArgumentException("line必须为正整数");}
        if (column < 0) { throw new IllegalArgumentException("column必须为正整数");}
        if (sign < 33 || sign > 126) { throw new IllegalArgumentException("输入字符为非可见字符");}

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}
