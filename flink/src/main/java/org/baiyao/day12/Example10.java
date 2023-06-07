package org.baiyao.day12;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/16:29
 * @Description: 实现接口的快捷键
 */
public class Example10 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("1", "2")
                .map(new InternalLogic())
                .print();

        env.execute();
    }

    private static class InternalLogic implements MapFunction<String, String> {
        @Override
        public String map(String in) throws Exception {
            return in;
        }
    }
}
