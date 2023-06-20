package day29.generics;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/20/11:10
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> a = new Student<>("江润冬", "良好");
        Student<Double> b = new Student<>("江明阳", 99.5d);
        Student<Integer> c = new Student<Integer>("王大妮", 99);

        System.out.println(a + "\n" +  b + "\n" + c);
    }
}
