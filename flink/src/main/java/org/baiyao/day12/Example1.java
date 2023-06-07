package org.baiyao.day12;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/21:40
 * @Description:
 */
public class Example1 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .print();

        env.execute();
    }
}