package org.baiyao.day13;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickEvent;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/20:23
 * @Description: filter -> 外部类实现方式
 */
public class Example1 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .filter(new FilterFunctionLogic())
                .print();

        env.execute();
    }

    private static class FilterFunctionLogic implements FilterFunction<ClickEvent>

    {
        @Override
        public boolean filter(ClickEvent in) throws Exception {
            return in.username.equals("tieDanEr");
        }
    }
}
