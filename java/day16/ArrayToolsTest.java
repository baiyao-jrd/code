package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/16:44
 * @Description:
 */
public class ArrayToolsTest {
    public static void main(String[] args) {
        int[] intArr = {1, 2, -5, 2, 89, 34, -1};

        System.out.println(ArrayTools.toString(intArr));
        System.out.println(ArrayTools.findMaxValue(intArr));
        System.out.println(ArrayTools.findIndex(intArr, -5) == -1 ? "不存在" : ArrayTools.findIndex(intArr, -5) );

        ArrayTools.sortIntArr(intArr);
        System.out.println(ArrayTools.toString(intArr));

        ArrayTools.inverse_special(intArr, 1, 3);
        System.out.println(ArrayTools.toString(intArr));

        ArrayTools.inverse_special(intArr, 0, 5);
        System.out.println(ArrayTools.toString(intArr));


        System.out.println(ArrayTools.toString(ArrayTools.copyNewArr(intArr, 3)));

//        System.out.println(true + false);
    }
}
