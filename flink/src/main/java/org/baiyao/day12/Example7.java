package org.baiyao.day12;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/18/22:38
 * @Description: 类型擦除 -> 有问题示例
 */
public class Example7 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("1", "2", "-3")
                .map(in -> Tuple2.of(in, 1))
                .print();

        env.execute();
    }
}

/**
 * Exception in thread "main" org.apache.flink.api.common.functions.InvalidTypesException:
 *      The return type of function 'main(Example7.java:20)' could not be determined automatically,
 *      due to type erasure. You can give type information hints by using the returns(...) method on the result
 *      of the transformation call, or by letting your function implement the 'ResultTypeQueryable' interface.
 */