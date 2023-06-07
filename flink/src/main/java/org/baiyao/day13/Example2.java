package org.baiyao.day13;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/20:27
 * @Description: filter -> lambda方式
 */
public class Example2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .filter(in -> in.username.equals("tieDanEr"))
                .print();

        env.execute();
    }
}
