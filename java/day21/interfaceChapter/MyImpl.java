package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:24
 * @Description:
 */
public class MyImpl implements MyInterface{
    @Override
    public void fun() {
        System.out.println("实现类实现接口中的抽象方法");
    }

    @Override
    public void solution() {
        System.out.println("实现类重写接口中的默认方法");
    }
}
