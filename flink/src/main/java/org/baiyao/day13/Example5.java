package org.baiyao.day13;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/20:41
 * @Description: white輸出1次，black输出两次 -> 外部类
 */
public class Example5 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("white", "black", "red")
                .flatMap(new FlatMapFuncLogic())
                .print();

        env.execute();
    }

    private static class FlatMapFuncLogic implements FlatMapFunction<String, String> {
        @Override
        public void flatMap(String in, Collector<String> out) throws Exception {
            if (in.equals("white")) {
                out.collect(in);
            } else if (in.equals("black")) {
                out.collect(in);
                out.collect(in);
            }
        }
    }
}
