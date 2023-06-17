package day26.dateClass;

import java.sql.Date;
import java.time.Instant;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/23:32
 * @Description:
 */
public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(Date.from(now));

        System.out.println(Date.from(now).toInstant());
    }
}
