package org.baiyao.day13;

import org.apache.flink.util.MathUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/22:00
 * @Description: 计算key在哪一个并行度的索引里面
 */
public class Example10 {
    public static void main(String[] args) {
        Integer key_0 = 0;
        Integer key_1 = 1;
        Integer key_2 = 2;
        Integer key_3 = 3;

        int key_0_hashCode = hashCodeMethod(key_0);
        int key_1_hashCode = hashCodeMethod(key_1);
        int key_2_hashCode = hashCodeMethod(key_2);
        int key_3_hashCode = hashCodeMethod(key_3);

        System.out.println("0 -> " + murmurHashMethod(key_0_hashCode));
        System.out.println("1 -> " + murmurHashMethod(key_1_hashCode));
        System.out.println("2 -> " + murmurHashMethod(key_2_hashCode));
        System.out.println("3 -> " + murmurHashMethod(key_3_hashCode));
    }

    private static int murmurHashMethod(int key_hashCode) {
        int index = MathUtils.murmurHash(key_hashCode);
        return ((index % 128) * 4 / 128);
    }

    private static int hashCodeMethod(Integer key) {
        return key.hashCode();
    }
}

/**
 * 0 -> 2 --> 第三个并行度
 * 1 -> 2 --> 第三个并行度
 * 2 -> 3 --> 第四个并行度
 * 3 -> 3 --> 第四个并行度
 */