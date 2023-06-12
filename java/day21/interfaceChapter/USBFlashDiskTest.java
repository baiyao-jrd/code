package day21.interfaceChapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/11/15:13
 * @Description:
 */
public class USBFlashDiskTest {
    public static void main(String[] args) {
        USBFlashDisk usbFlashDisk = new USBFlashDisk();
        usbFlashDisk.work();
        usbFlashDisk.write();
        usbFlashDisk.read();
    }
}
