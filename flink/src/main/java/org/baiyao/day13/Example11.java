package org.baiyao.day13;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.IntSource;
import org.baiyao.util.Statistic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/22:19
 * @Description:
 */
public class Example11 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new IntSource())
                .map(new MapFunction<Integer, Statistic>() {
                    @Override
                    public Statistic map(Integer in) throws Exception {
                        return new Statistic(
                                in,
                                in,
                                in,
                                1,
                                in
                        );
                    }
                })
                .keyBy(in -> "1")
                .reduce(new ReduceFunction<Statistic>() {

                    @Override
                    public Statistic reduce(Statistic first, Statistic second) throws Exception {
                        return new Statistic(
                                Math.min(first.min, second.min),
                                Math.max(first.max, second.max),
                                first.sum + second.sum,
                                ++first.count,
                                (first.sum + second.sum) / (first.count + 1)
                        );
                    }
                })
                .print();

        env.execute();

    }
}
