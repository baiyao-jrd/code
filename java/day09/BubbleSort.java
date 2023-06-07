package day09;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/18:40
 * @Description: 冒泡排序 -> 将int数组中的值按照从小到大的顺序排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = {1, 4, 8, 23, -3, 2, 15};
        
        //1. 一趟趟遍历，每一趟遍历出来一个最小的值，放在最左侧
        for (int outerCursor = 0; outerCursor < intArr.length; outerCursor++) {
            for (int innerCursor = outerCursor + 1; innerCursor < intArr.length; innerCursor++) {
                if (intArr[outerCursor] > intArr[innerCursor]) {
                    intArr[outerCursor] = intArr[outerCursor] ^ intArr[innerCursor];
                    intArr[innerCursor] = intArr[outerCursor] ^ intArr[innerCursor];
                    intArr[outerCursor] = intArr[outerCursor] ^ intArr[innerCursor];
                }
            }
        }
        
        //2. 遍历输出数组
        for (int elem : intArr) {
            System.out.print(elem + " ");
        }
    }
}
