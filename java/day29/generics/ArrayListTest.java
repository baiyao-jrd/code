package day29.generics;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/10:57
 * @Description:
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("江润冬");
        strings.add("江明阳");
        strings.add("江奇志");

        // 非String类型, 添加不进去, 编译报错
        // strings.add(1);

        for (String string : strings) {
            System.out.print(string.length() + " ");
        }
    }
}
