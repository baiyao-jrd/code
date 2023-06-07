package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/16:28
 * @Description:    数组工具类 -> 包含6个方法功能
 * 1. 可以将任意整型数组实现从小到大排序
 * 2. 可以在任意整型数组中找到最大值
 * 3. 可以自任意整型数组中找到某个元素的下标，如果不存在就返回-1
 * 4. 可以将任意整型数组的指定范围[start, end]的元素进行反转
 * 5. 可以从一个源数组复制指定长度的新数组
 * 6. 可以将任意整型数组的元素拼接为一个字符串进行返回，形式如[1, 2, 3, 4]
 */
public class ArrayTools {
//* 1. 可以将任意整型数组实现从小到大排序
    public static void sortIntArr(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
    }

//* 2. 可以在任意整型数组中找到最大值
    public static int findMaxValue(int[] intArr) {
        int max = Integer.MIN_VALUE;
        for (int value : intArr) {
            if (value > max)
                max = value;
        }

        return max;
    }

//* 3. 可以自任意整型数组中找到某个元素的下标，如果不存在就返回-1
    public static int findIndex(int[] intArr, int target) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == target) {
                return i;
            }
        }

        return -1;
    }

//* 4. 可以将任意整型数组的指定范围[start, end]的元素进行反转
    public static void inverse_special(int[] intArr, int start, int end) {
        int flag;

        if (end % 2 == 0) {
            flag = end + 1;
        } else {
            flag = end;
        };

        for (int i = start, j = end; i <= (flag - start) / 2; i++, j--) {
            int temp = intArr[j];
            intArr[j] = intArr[i];
            intArr[i] = temp;
        }
    }

//* 5. 可以从一个源数组复制指定长度的新数组
    public static int[] copyNewArr(int[] intArr, int len) {
        int[] newIntArr = new int[len];

        for (int i = 0; i < intArr.length && i < len; i++) {
            newIntArr[i] = intArr[i];
        }

        return newIntArr;
    }

//* 6. 可以将任意整型数组的元素拼接为一个字符串进行返回，形式如[1, 2, 3, 4]
    public static String toString(int[] intArr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < intArr.length; i++) {
            if (i == 0) {
                stringBuilder.append("{" + intArr[i] + ", ");
            } else if (i == intArr.length - 1) {
                stringBuilder.append(intArr[i] + "}");
            } else {
                stringBuilder.append(intArr[i] + ", ");
            }
        }

        return stringBuilder.toString();
    }
}
