package org.baiyao.util;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/21:45
 * @Description:
 */
public class ClickSource implements SourceFunction<ClickEvent> {
    private boolean flag = true;
    private Random random = new Random();
    private String[] usernameArrays = new String[] {"zhagnSan", "liSi", "wangMaZi", "tieDanEr"};
    private String[] urlArrays = new String[] {"./home", "./buy", "./cart", "./page", "./index"};

    @Override
    public void run(SourceContext<ClickEvent> ctx) throws Exception {
        while(flag) {
            ctx.collect(new ClickEvent(
                    usernameArrays[random.nextInt(usernameArrays.length)],
                    urlArrays[random.nextInt(urlArrays.length)],
                    Calendar.getInstance().getTimeInMillis()
            ));
            Thread.sleep(200);
        }
    }

    @Override
    public void cancel() {
        flag = false;
    }
}
