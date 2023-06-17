package day26.dateClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/23:36
 * @Description:
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");

        System.out.println(dateTimeFormatter.format(now));

        System.out.println(LocalDateTime.parse("2023-06-17 下午 11:40:53", dateTimeFormatter));
    }
}
