package day23.annotate.customAnnotation;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/15:22
 * @Description:
 */
public class MyClass {
    @MyAnnotation
    public void method() {
        System.out.println("method");
    }

    @MyAnnotation("江润冬")
    public void way() {
        System.out.println("way");
    }

    @MyAnnotation(value = "江明阳")
    public void fun() {
        System.out.println("fun");
    }
}