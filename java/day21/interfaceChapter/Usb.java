package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/11:38
 * @Description:
 */
public interface Usb {
//    此处省略了public static final
    long MAX_SPEED = 500 * 1024 * 1024;

//    此处省略了public abstract
    void read();

    void write();
}
