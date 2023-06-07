package org.baiyao.day13;

import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/21:48
 * @Description: 聚合
 */
public class Example8 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements(1, 2, 3, 4, 5, 6, 7, 8)
                .keyBy(in -> in % 3)
                .reduce(new ReduceFunction<Integer>() {
                    @Override
                    public Integer reduce(Integer acc, Integer in) throws Exception {
                        return acc + in;
                    }
                })
                .setParallelism(4)
                .print()
                .setParallelism(4);

        env.execute();
    }
}
