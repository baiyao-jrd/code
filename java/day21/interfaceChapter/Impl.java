package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:42
 * @Description:
 */
public class Impl implements MyInter1, MyInter2{
    @Override
    public void method() {
//        MyInter2.super.method();
        System.out.println("实现类");
    }
}
