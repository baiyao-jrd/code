package org.baiyao.day12;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:31
 * @Description: 类型擦除 -> 该例没有问题
 */
public class Example6 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("1", "2", "-3")
                .map(new MapFunction<String, Tuple2<String, Integer>>() {

                    @Override
                    public Tuple2<String, Integer> map(String in) throws Exception {
                        return Tuple2.of(in, 1);
                    }
                })
                .print();

        env.execute();
    }
}
