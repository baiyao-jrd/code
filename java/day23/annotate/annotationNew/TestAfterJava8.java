package day23.annotate.annotationNew;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/16:08
 * @Description:
 */
public class TestAfterJava8 {
    @MyAnn("baiyao")
    @MyAnn("rundong")
    public void method() {
        System.out.println("method");
    }
}
