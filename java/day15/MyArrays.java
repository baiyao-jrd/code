package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/15:51
 * @Description: 静态方法 -> 数组工具类 -> 两个静态方法
 *                                      1. sort -> 将整型数组从大到小排序
 *                                      2. toString -> 将整型数组的元素拼接为字符串后输出
 */
public class MyArrays {
    public static int[] sort(int[] intArr) {
        for (int outer = 0; outer < intArr.length - 1; outer++) {
            for (int inner = outer + 1; inner < intArr.length; inner++) {
                if (intArr[outer] < intArr[inner]) {
                    int temp = intArr[outer];
                    intArr[outer] = intArr[inner];
                    intArr[inner] = temp;
                }
            }
        }
        return intArr;
    }

    public static String toString(int[] intArr, String strName) {
        String arrToString = strName + ": \n";

        for (int i = 0; i < intArr.length; i++) {
            if (i == 0) {
                arrToString += "{" +  intArr[0] + ", ";
            } else if (i == intArr.length - 1) {
                arrToString += intArr[intArr.length - 1] + "}";
            } else {
                arrToString += intArr[i] + ", ";
            }
        }

        arrToString += "\n";

        return arrToString;
    }
}