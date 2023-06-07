package org.baiyao.day13;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/21:56
 * @Description: 聚合函数 -> lambda表达式
 */
public class Example9 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements(1, 2, 3, 4, 5, 6)
                .keyBy(in -> in % 3)
                .reduce((a, b) -> a + b)
                .setParallelism(4)
                .print()
                .setParallelism(4);

        env.execute();
    }
}
