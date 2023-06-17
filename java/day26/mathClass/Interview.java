package day26.mathClass;
import static java.lang.Math.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/17/21:47
 * @Description:    计算在-10.8 ~ 5.9范围内绝对值大于等于6 或者 小于等于2的整数有多少个
 */
public class Interview {
    public static void main(String[] args) {
        int cnt = 0;

        for (int i = (int)(ceil(-10.8)); i <= (int)(floor(5.9)); i++) {
            if (abs(i) >= 6 || abs(i) <= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
