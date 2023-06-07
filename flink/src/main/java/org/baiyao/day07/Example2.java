package org.baiyao.day07;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/20:20
 * @Description: 将所有算子的并行子任务的数量均设置为1
 */
public class Example2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        executionEnvironment.setParallelism(1);

        executionEnvironment
                .readTextFile("C:\\Users\\yunnanbaiyao\\Desktop\\code\\flink\\src\\main\\resources\\words.txt")
                .flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {
                    @Override
                    public void flatMap(String in, Collector<Tuple2<String, Integer>> out) throws Exception {
                        String[] words = in.split(" ");
                        for (int position = 0; position < words.length; position++) {
                            out.collect(Tuple2.of(words[position], 1));
                        }
                    }
                })
                .keyBy(r -> r.f0)
                .reduce(new ReduceFunction<Tuple2<String, Integer>>() {
                    @Override
                    public Tuple2<String, Integer> reduce(Tuple2<String, Integer> acc, Tuple2<String, Integer> in) throws Exception {
                        return Tuple2.of(in.f0, acc.f1 + in.f1);
                    }
                })
                .print();

        executionEnvironment.execute();

    }
}
