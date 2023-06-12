package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:11
 * @Description:
 */
public interface UsbDevice extends Readable, Writeable {
    void work();
}
