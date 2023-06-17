package day26.dateClass;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/22:16
 * @Description:
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"), Locale.CHINA);

        System.out.println("年: " + c.get(Calendar.YEAR) + "月: " + (c.get(Calendar.MONTH) + 1) + "日: " + c.get(Calendar.DAY_OF_MONTH) + "小时: " + c.get(Calendar.HOUR) + "分钟: " + c.get(Calendar.MINUTE) + "秒: " + c.get(Calendar.SECOND));
    }
}
