package day26.dateClass;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/23:25
 * @Description:
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear() + "年" + localDateTime.getMonth() + "月" + localDateTime.getDayOfMonth() + "" +
                "日" + localDateTime.getHour() + "时" + localDateTime.getMinute() + "分" + localDateTime.getSecond() + "秒");

    }
}
