package day15;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/21/17:36
 * @Description: 面试题 -> 坑!!!!!!
 */
public class TestParamExam {
    public static void change(MyData myData) {
        myData = new MyData();

        myData.a = 2;
    }

    public static MyData changeReally(MyData myData) {
        myData = new MyData();

        myData.a = 2;

        return myData;
    }

    public static void main(String[] args) {
        MyData myData = new MyData();
        myData.a = 1;

        change(myData);

        System.out.println(myData.a);   //1 -> 因为，change方法里面拿到的是堆内存对象的地址副本，方法内新对象地址实际上是赋值给了
        //副本地址，等方法结束执行之后，内存空间被释放

        MyData myData1 = changeReally(myData);
        System.out.println(myData1.a);
    }
}
