package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/17:00
 * @Description:
 */
public class ReferenceTypes {
    public static void operate(MyData myData) {
        myData.a *= 2;
    }

    public static void main(String[] args) {
        MyData a = new MyData();

        a.a = 2;

        operate(a);             //这里传的a是一个堆内存中的对象地址
        System.out.println(a.a);
    }
}
