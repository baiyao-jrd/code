package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:12
 * @Description:
 */
public class USBFlashDisk implements UsbDevice{
    @Override
    public void read() {
        System.out.println("读数据");
    }

    @Override
    public void work() {
        System.out.println("存数据");
    }

    @Override
    public void write() {
        System.out.println("写数据");
    }
}
