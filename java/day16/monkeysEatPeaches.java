package day16;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/18:59
 * @Description: 猴子吃桃
 *                  猴子第一天摘下若干个桃子，当即吃了摘下桃子的一半，还不过瘾，又多吃了一个。
 *                  第二天又将剩下的桃子吃了一半，随后又多吃了一个。以后每天猴子都吃了前一天
 *                  剩下桃子的一半多一个。
 *
 *                  到第十天，猴子发现只剩下一个桃子了，请问第一天猴子摘了多少桃子？
 */
public class monkeysEatPeaches {
    public static int eatPeachs(int day_cnt, int base) {
        if (day_cnt == 1)
            return base;
        return eatPeachs(day_cnt - 1, (base + 1) * 2);
    }

    public static void main(String[] args) {
        System.out.println(eatPeachs(10, 1));
    }
}
