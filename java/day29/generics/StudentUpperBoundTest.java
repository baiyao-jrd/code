package day29.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:27
 * @Description:
 */
public class StudentUpperBoundTest {
    public static void main(String[] args) {
        GenericStudent<Integer> a = new GenericStudent<>("江润冬", 95);
        GenericStudent<Double> b = new GenericStudent<>("王大妮", 98.6);
        GenericStudent<Long> c = new GenericStudent<>("江奇志", 987665L);

        // String不是Number的子类, 编译报错
//        GenericStudent<T> d = new GenericStudent<>("江明阳", "江明阳");

        System.out.println(a + "\n" + b + "\n" + c);
    }
}
