package org.baiyao.day07;

import org.apache.flink.api.common.functions.FlatMapFunction;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/20:41
 * @Description:
 */
public class Example3 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        executionEnvironment.setParallelism(1);

        executionEnvironment
                .fromElements("hello,baiyao", "hello,baiyao")
                .flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {
                    @Override
                    public void flatMap(String in, Collector<Tuple2<String, Integer>> out) throws Exception {
                        String[] words = in.split("\\,");
                        for (String word : words) {
                            out.collect(Tuple2.of(word, 1));
                        }
                    }
                })
                .keyBy(r -> r.f0)
                .reduce((acc, in) -> Tuple2.of(in.f0, acc.f1 + in.f1))
                .print();

        executionEnvironment.execute();
    }
}
