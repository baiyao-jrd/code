package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/9:23
 * @Description:    对象数组的初始化
 */
public class ObjectArray {
    public static void main(String[] args) {
        // 1. 动态初始化
        MyArray[] myArrays = new MyArray[3];
        for (int i = 0; i < myArrays.length; i++) {
            myArrays[i] = new MyArray();
            myArrays[i].value = i + 1;
        }

        // 2. 静态初始化
        MyArray[] arrays = {new MyArray(1), new MyArray(2), new MyArray(3)};

        for (int i = 0; i < 3; i++) {
            System.out.println(myArrays[i]);

            System.out.println(arrays[i]);
        }
    }
}

class MyArray {
    int value;

    public MyArray() {
    }

    public MyArray(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "value=" + value +
                '}';
    }
}
