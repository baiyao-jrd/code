package day10;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/15/15:01
 * @Description: 快速排序 -> leftCursor、rightCursor、pivot
 *                         leftCursor向右移动，移动到大于arr[pivot]处停止
 *                         接着，rightCursor向左移动，移动到小于arr[pivot]处停止
 *                         接着，交换arr[leftCursor]与arr[rightCursor]的值
 *
 *                         接着，持续上面三个步骤，直到最后leftCursor == rightCursor，此时将此处的值与arr[pivot]进行交换
 *                         到现在为止保证了基准值左侧的都比基准值小，基准值右侧的都比基准值大
 *
 *                         循环往复
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 5, 34, 12, -3, 6, 4, 4};

//        quickSort(intArr);

        int a = 1, b = 2;
        int[] newArr = exchange(a, b);
        a = newArr[0];
        b = newArr[1];

        System.out.println("a = " + a + ", b = " + b);
    }

    private static void quickSort(int[] intArr) {
        int leftCursor = 0, rightCursor = intArr.length - 1;

        loop(leftCursor, rightCursor, intArr);
    }

    private static int loop(int leftCursor, int rightCursor, int[] intArr) {

        int pivot = leftCursor;

        Boolean leftFlag = false, rightFlag = false;

        for (; leftCursor != rightCursor; ) {

            if (leftFlag == false && rightFlag == false) {
                leftCursor++;
            } else if (leftFlag == true && rightFlag == false) {
                rightCursor++;
            }

            if (intArr[leftCursor] > intArr[pivot]) {
                leftFlag = true;
            }

            if ( intArr[rightCursor] < intArr[pivot]) {
                rightFlag = true;
            }

            if (leftFlag & rightFlag) {
                exchange(intArr[leftCursor], intArr[rightCursor]);
                leftFlag = rightFlag = false;
            }
        }

        return 0;
    }

    private static int[] exchange(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[] {a, b};
    }
}
