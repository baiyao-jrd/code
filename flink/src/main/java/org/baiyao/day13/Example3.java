package org.baiyao.day13;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;
import org.baiyao.util.ClickEvent;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/20:30
 * @Description: flatmap -> 匿名类的实现方式
 */
public class Example3 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .flatMap(new FlatMapFunction<ClickEvent, ClickEvent>() {
                    @Override
                    public void flatMap(ClickEvent in, Collector<ClickEvent> out) throws Exception {
                        if (in.username.equals("tieDanEr")) {
                            out.collect(in);
                        }
                    }
                })
                .print();

        env.execute();
    }
}
