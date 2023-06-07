package day09;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/14/16:42
 * @Description: 二分查找 -> 查找int数组中是否存在某个int值
 *               二分查找前提是数组有序
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] intArr = {1, 4, 5, 8, 16};
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入所要查找的值：");
        int searchValue = scanner.nextInt();

        System.out.println("int数组中" + (binarySearch(searchValue, intArr) != -1 ? "存在该值，索引为：" + binarySearch(searchValue, intArr) : "不存在该值~"));
    }

    private static int binarySearch(int searchValue, int[] inputArray) {
        int index = -1;

        for (int leftPointer = 0, midPointer = (inputArray.length - 1) / 2, rightPointer = inputArray.length - 1; leftPointer <= rightPointer;) {
            if (searchValue == inputArray[midPointer]) {
                index = midPointer;
                break;
            } else if (searchValue < inputArray[midPointer]) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
            midPointer = leftPointer +  (rightPointer - leftPointer) / 2;
        }

        return index;
    }
}
