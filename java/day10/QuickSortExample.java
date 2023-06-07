package day10;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/16/17:29
 * @Description: 快速排序 -> 跟书敲
 */
public class QuickSortExample {
    public static void main(String[] args) {
        int[] intArr = {1, -3, 6, 3, 3, 35, 12, 2};

        System.out.print("排序之前：");
        for (int elem : intArr) {
            System.out.print(elem + " ");
        }

        quickSort(intArr);

        System.out.print("\n排序之后：");
        for (int elem : intArr) {
            System.out.print(elem + " ");
        }
    }

    private static void quickSort(int[] intArr) {
        loop(intArr, 0, intArr.length - 1);
    }

    private static void loop(int[] intArr, int leftCursor, int rightCursor) {
        if (leftCursor < rightCursor) {
            int pivot = intArr[leftCursor];

            int low = leftCursor;
            int high = rightCursor + 1;

            while(true) {
                while (low < rightCursor && intArr[++low] - pivot <= 0) ;
                while (high > leftCursor && intArr[--high] - pivot >= 0) ;

                if (leftCursor < high) {
                    swap(intArr, leftCursor, high);
                } else {
                    break;
                }
            }

            swap(intArr, leftCursor, high);

            loop(intArr, leftCursor, high - 1);
            loop(intArr, high + 1, rightCursor);
        }
    }

    private static void swap(int[] intArr, int positionA, int positionB) {
        int temp = intArr[positionA];
        intArr[positionA] = intArr[positionB];
        intArr[positionB] = temp;
    }
}