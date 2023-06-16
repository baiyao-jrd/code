package day25.stringClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/16/18:36
 * @Description:    实现将double类的价格1234567.89转换成1,234,567.89
 */
public class StringBufferTest {
    public static void main(String[] args) {
        System.out.println(trans(1234567.89));
    }

    public static String trans(double a) {
        String s = String.valueOf(a);

        String[] split = s.split("\\.");
        String tail = split[1];

        StringBuffer stringBuffer = new StringBuffer(String.valueOf((int)a));

        StringBuffer reverse = stringBuffer.reverse();

        for (int i = 0, j = 0; i < reverse.length(); i++) {
            if (i % 3 == 0 && i + j < reverse.length() && i != 0) {
                reverse.insert(i + j, ",");
                j++;
            }
        }

        return reverse.reverse().toString().concat("." + tail);
    }
}
