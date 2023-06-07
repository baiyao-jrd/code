package org.baiyao.day13;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/20:46
 * @Description: white输出1次，black输出两次 -> lambda方式
 */
public class Example6 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        env
                .fromElements("white", "black", "red")
                .flatMap((String in, Collector<String> out) -> {
                    if("white".equals(in)) {
                        out.collect(in);
                    } else if ("black".equals(in)) {
                        out.collect(in);
                        out.collect(in);
                    }
                })
                .returns(Types.STRING)
                .print();

        env.execute();
    }
}
