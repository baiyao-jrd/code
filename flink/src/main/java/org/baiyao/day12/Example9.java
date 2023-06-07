package org.baiyao.day12;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickEvent;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:52
 * @Description: filter匿名类
 */
public class Example9 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .filter(new FilterFunction<ClickEvent>() {
                    @Override
                    public boolean filter(ClickEvent in) throws Exception {
                        return in.username.equals("tieDanEr");
                    }
                })
                .print();

        env.execute();
    }
}
