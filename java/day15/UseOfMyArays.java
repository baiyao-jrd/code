package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/16:13
 * @Description: 数组工具类的使用
 */
public class UseOfMyArays {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, -7, 4, 4};

        System.out.println(MyArrays.toString(intArr, "intArr"));

        int[] intArrNew = MyArrays.sort(intArr);

        System.out.println(MyArrays.toString(intArrNew, "intArrNew"));
    }
}
