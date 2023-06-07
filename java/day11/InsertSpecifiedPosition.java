package day11;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/17/17:47
 * @Description: 往数组的指定位置插入元素 -> 插入位置之后的元素都要后移
 */
public class InsertSpecifiedPosition {
    public static void main(String[] args) {
        String[] arr = new String[6];

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 && i != arr.length - 2)   arr[i] = "小明" + (i + 1);
        }

        System.out.print("\n插入前：");
        traverseOfArrays(arr);

        int insertPosi = 2;

        for (int posi = arr.length - 1; posi > insertPosi; posi--) {
            arr[posi] = arr[posi - 1];
        }
        arr[insertPosi] = "金瓶梅";

        System.out.print("\n插入后：");
        traverseOfArrays(arr);
    }

    private static void traverseOfArrays(String[] arr) {
        for (String elem : arr) {
            System.out.print(elem != null ? elem + " " : "");
        }
    }
}
