package day24.throwKeywords.DemoCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/15/11:26
 * @Description:
 */
public abstract class Father {
    public abstract void method();
}

class Son extends Father {

    @Override
    public void method() {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
