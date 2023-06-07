package day17;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/07/12:16
 * @Description:
 */
public class Constructor {
    int value;

    public Constructor() {
        System.out.println("空构造器被调用了");
    }

    public Constructor(int value) {
//        this();
        this.value = value;
    }
}
