package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:41
 * @Description:
 */
public interface MyInter2 {
    default void method() {
        System.out.println("接口2");
    }
}
