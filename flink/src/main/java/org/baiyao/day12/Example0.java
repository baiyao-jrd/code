package org.baiyao.day12;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:02
 * @Description: 测试程序
 */
public class Example0 {
    public static void main(String[] args) throws InterruptedException {
        String[] strArr = {"zhangSan", "liSi", "wangMaZi", "tieDanEr"};

        Random random = new Random();

        while (true) {
            System.out.println("--> " + random.nextInt(strArr.length));
            System.out.println("--> " + new Timestamp(Calendar.getInstance().getTimeInMillis()));
            Thread.sleep(200);
        }
    }
}
