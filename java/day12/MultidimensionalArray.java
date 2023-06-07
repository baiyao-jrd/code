package day12;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/17:13
 * @Description: 多维数组初始化 & 遍历
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        //1. 静态初始化
        int[][] intMulArr = new int[][] {{1, 2, 3, 4}, {6, 9}};
        int[][] intMulArr2 = {{1, 3, 5}, {4, 6, 9}};

        traverseElements(intMulArr, "intMulArr");
        traverseElements(intMulArr2, "intMulArr2");

        //2. 动态初始化
        int[][] intMulArr3 = new int[3][2];

        int[][] intMulArr4 = new int[2][];
        intMulArr4[0] = new int[1];
        intMulArr4[1] = new int[2];

        traverseElements(intMulArr3, "intMulArr3");
        traverseElements(intMulArr4, "intMulArr4");
    }

    private static void traverseElements(int[][] intMulArr, String sout) {
        System.out.print("\n" + sout + ": ");
        for (int outerIndex = 0; outerIndex < intMulArr.length; outerIndex++) {
            System.out.print(outerIndex == 0 ? "{" : "");

            for (int innerIndex = 0; innerIndex < intMulArr[outerIndex].length; innerIndex++) {
                System.out.print((innerIndex == 0 ? "{" + intMulArr[outerIndex][innerIndex] : intMulArr[outerIndex][innerIndex]) + (innerIndex == intMulArr[outerIndex].length - 1 ? "}" : ", "));
            }

            System.out.print(outerIndex == intMulArr.length - 1 ? "}" : ", ");
        }
    }
}