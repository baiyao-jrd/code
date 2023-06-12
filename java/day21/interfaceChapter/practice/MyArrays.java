package day21.interfaceChapter.practice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:52
 * @Description:
 */
public class MyArrays {
    // 数组排序
    public static void bubbleSort (Object[] arr) {
        // 冒泡排序 - 进行length - 1趟，每一趟，最后一个元素是该趟最大的元素
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (((Sortable)arr[j + 1]).sort(arr[j]) < 0) {
                    Object obj = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = obj;
                }
            }
        }

        // 遍历
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
