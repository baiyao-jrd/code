package org.baiyao.day12;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:42
 * @Description: 类型擦除 -> 解决
 */
public class Example8 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("1", "2", "-3")
                .map(in -> Tuple2.of(in, 1))
                .returns(Types.TUPLE(
                        Types.STRING,
                        Types.INT
                ))
                .print();

        env.execute();
    }
}
