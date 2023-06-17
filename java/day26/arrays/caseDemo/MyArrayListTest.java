package day26.arrays.caseDemo;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/16:22
 * @Description:
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add("zhangSan");
        myArrayList.add("liSi");
        myArrayList.set(1, "wangEr");
        myArrayList.add("maZi");
        myArrayList.add("你是谁？");

        System.out.println("容器内的元素个数: " + myArrayList.total);

        System.out.println("容器元素为: " + Arrays.toString(myArrayList.getAll()));

        myArrayList.remove(1);

        System.out.println("容器内的元素个数: " + myArrayList.total);
        System.out.println("容器元素为: " + Arrays.toString(myArrayList.getAll()));

        myArrayList.remove("你是谁？");

        System.out.println("容器内的元素个数: " + myArrayList.total);
        System.out.println("容器元素为: " + Arrays.toString(myArrayList.getAll()));

        myArrayList.set(0, "江润冬");
        myArrayList.set("maZi", "江明阳");

        System.out.println("容器内的元素个数: " + myArrayList.total);
        System.out.println("容器元素为: " + Arrays.toString(myArrayList.getAll()));

        System.out.println("数组中还是否存在'江润冬': " + myArrayList.contain("江润冬"));
        System.out.println("数组中'江润冬'的下标: " + myArrayList.indexOf("江润冬"));
        System.out.println("数组中的1号元素: " + myArrayList.get(1));

    }
}
