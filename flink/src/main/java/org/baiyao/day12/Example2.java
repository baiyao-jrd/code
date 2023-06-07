package org.baiyao.day12;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickEvent;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:13
 * @Description: 使用匿名内部类实现map
 */
public class Example2 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
        
        env
                .addSource(new ClickSource())
                .map(new MapFunction<ClickEvent, String>() {
                    @Override
                    public String map(ClickEvent in) throws Exception {
                        return in.username;
                    }
                })
                .print();

        env.execute();
    }
}
