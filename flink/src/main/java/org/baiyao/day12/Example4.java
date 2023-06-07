package org.baiyao.day12;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.baiyao.util.ClickSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:23
 * @Description: 使用匿名函数实现map
 */
public class Example4 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .addSource(new ClickSource())
                .map(in -> in.username)
                .print();

        env.execute();
    }
}
