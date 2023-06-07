package day12;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/17:55
 * @Description: 矩阵转置
 *                      -> 随机产生一个4行5列的[1, 100]整数组成的矩阵，遍历
 *                      -> 转置矩阵，遍历
 *
 *                      {00, 01, 02, 03, 04}
 *                      {10, 11, 12, 13, 14}
 *                      {20, 21, 22, 23, 24}
 *                      {30, 31, 32, 33, 34}
 *
 */
public class MatrixDemo {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrixArr = new int[4][5];

        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                matrixArr[i][j] = (int)(Math.random() * 100) + 1;
            }
        }

        traverseElements(matrixArr, "matrixArr");

        int[][] transpositionArr = new int[matrixArr[0].length][matrixArr.length];

        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                transpositionArr[j][i] = matrixArr[i][j];
            }
        }

        traverseElements(transpositionArr, "transpositionArr");
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

/**
 *  {72, 83, 38, 60, 53}
 *  {32, 95, 88, 19, 9}
 *  {65, 1, 16, 19, 99}
 *  {4, 11, 8, 99, 18}
 *
 *  {72, 32, 65, 4}
 *  {83, 95, 1, 11}
 *  {38, 88, 16, 8}
 *  {60, 19, 19, 99}
 *  {53, 9, 99, 18}
 */
