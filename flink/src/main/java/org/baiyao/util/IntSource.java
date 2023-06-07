package org.baiyao.util;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/22:16
 * @Description:
 */
public class IntSource implements SourceFunction<Integer> {
    Random random = new Random();
    Boolean flag = true;

    @Override
    public void run(SourceContext ctx) throws Exception {
        while (flag) {
            ctx.collect(random.nextInt(1000));
            Thread.sleep(200);
        }
    }

    @Override
    public void cancel() {
        flag = false;
    }
}
