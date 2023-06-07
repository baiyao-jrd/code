package day12;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/17:37
 * @Description: 杨辉三角
 *                       -> 使用二维数组存储10行的杨辉三角数字 & 遍历
 */
public class YangHuiSanJiao {
    public static void main(String[] args) {
        int[][] yangHuiArr = new int[10][];

        for (int i = 0; i < yangHuiArr.length; i++) {
            yangHuiArr[i] = new int[i + 1];
            for (int j = 0; j < yangHuiArr[i].length; j++) {
                if (j == 0 || j == yangHuiArr[i].length - 1) {
                    yangHuiArr[i][j] = 1;
                } else {
                    yangHuiArr[i][j] = yangHuiArr[i - 1][j - 1] + yangHuiArr[i - 1][j];
                }
            }
        }

        traverseElements(yangHuiArr, "yangHuiArr");
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
