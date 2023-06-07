package org.baiyao.util;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/19/22:21
 * @Description: 统计类
 */
public class Statistic {
    public Integer min;
    public Integer max;
    public Integer sum;
    public Integer count;
    public Integer average;

    public Statistic() {
    }

    public Statistic(Integer min, Integer max, Integer sum, Integer count, Integer average) {
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.count = count;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "min=" + min +
                ", max=" + max +
                ", sum=" + sum +
                ", count=" + count +
                ", average=" + average +
                '}';
    }
}
