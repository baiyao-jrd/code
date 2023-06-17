package day26.dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/22:06
 * @Description:
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("当前时间: " + new Date());
        System.out.println("当前的时间戳: " + new Date().getTime());

        System.out.println(new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒S毫秒").format(new Date()));
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒S毫秒").parse("2023年6月17日22时14分55秒123毫秒"));

    }
}
