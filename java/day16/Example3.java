package day16;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/06/23:22
 * @Description:
 */
public class Example3 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexFlag = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2), valueFlag = 0;

        for (List<String> item : items) {
            if (item.get(indexFlag).equals(ruleValue))
                valueFlag++;
        }

        return  valueFlag;
    }
}
