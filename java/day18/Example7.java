package day18;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/08/15:43
 * @Description:
 */
public class Example7 {
    public static int numJewelsInStones(String jewels, String stones) {
        int flag = 0;

        for (String s : stones.split("")) {
            if (jewels.contains(s))
                flag++;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
