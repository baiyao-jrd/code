package org.baiyao.day07;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.java.functions.KeySelector;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/12/19:43
 * @Description:
 */
public class Example1 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        executionEnvironment
                .socketTextStream("hadoop102", 8899)
                .setParallelism(1)
                .flatMap(new Tokenizer())
                .setParallelism(1)
                .keyBy(new KeySelector<Tuple2<String, Integer>, String>() {
                    @Override
                    public String getKey(Tuple2<String, Integer> in) throws Exception {
                        return in.f0;
                    }
                })
                .reduce(new WordCount())
                .setParallelism(1)
                .print()
                .setParallelism(1);

        executionEnvironment.execute();
    }

    private static class WordCount implements ReduceFunction<Tuple2<String, Integer>> {
        @Override
        public Tuple2<String, Integer> reduce(Tuple2<String, Integer> acc, Tuple2<String, Integer> in) throws Exception {
            return Tuple2.of(in.f0, acc.f1 + in.f1);
        }
    }

    private static class Tokenizer implements FlatMapFunction<String, Tuple2<String, Integer>> {
        @Override
        public void flatMap(String in, Collector<Tuple2<String, Integer>> out) throws Exception {
            String[] words = in.split(" ");
            for (int word = 0; word < words.length; word++) {
                out.collect(Tuple2.of(words[word], 1));
            }
        }
    }
}
