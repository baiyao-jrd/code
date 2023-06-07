package day08;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/17:38
 * @Description: 查看一下 -> 各种类型的数组元素 -> 它的默认值
 */
public class DefaultValuesForArrays {
    public static void main(String[] args) {
        byte[] byteArr = new byte[5];
        short[] shortArr = new short[5];
        int[] intArr = new int[5];
        long[] longArr = new long[5];
        float[] floatArr = new float[5];
        double[] doubleArr = new double[5];

        char[] charArr = new char[5];
        boolean[] booleanArr = new boolean[5];
        String[] strArr = new String[5];

        System.out.println("byte类型的数组默认值为：" + byteArr[0]);
        System.out.println("short类型的数组默认值为：" + shortArr[0]);
        System.out.println("int类型的数组默认值为：" + intArr[0]);
        System.out.println("long类型的数组默认值为：" + longArr[0]);
        System.out.println("float类型的数组默认值为：" + floatArr[0]);
        System.out.println("double类型的数组默认值为：" + doubleArr[0]);
        System.out.println("char类型的数组默认值为：" + charArr[0]);
        System.out.println("boolean类型的数组默认值为：" + booleanArr[0]);
        System.out.println("String类型的数组默认值为：" + strArr[0]);
    }
}
