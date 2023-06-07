package org.baiyao.day12;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;
import org.baiyao.util.ClickEvent;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:25
 * @Description: 使用flatmap实现map的功能
 */
public class Example5 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .flatMap(new FlatMapFunction<ClickEvent, String>() {
                    @Override
                    public void flatMap(ClickEvent in, Collector<String> out) throws Exception {
                        out.collect(in.username);
                    }
                })
                .print();

        env.execute();
    }
}
