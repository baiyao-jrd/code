package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:40
 * @Description:
 */
public interface MyInter1 {
    default void method() {
        System.out.println("接口1");
    }
}
