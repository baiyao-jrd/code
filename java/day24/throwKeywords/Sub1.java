package day24.throwKeywords;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/10:02
 * @Description:
 */
public class Sub1 extends Base {
    public void method() throws FileNotFoundException {}

    public void fun() throws RuntimeException {}
}

class Sub2 extends Base {
      // 编译报错
//    public void method() throws Exception {}
//    public void fun() throws Exception {}
}