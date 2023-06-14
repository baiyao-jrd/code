package day23.annotate.customAnnotation;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/15:36
 * @Description:
 */
public class TestBeforeJava8 {
    @AnnArray({ @MyAnn("baiyao"), @MyAnn("rundong") })
    public void method() {
        System.out.println("method");
    }
}
