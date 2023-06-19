package day27.list;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:00
 * @Description:
 */
public class ListForTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(0, "江润冬");
        arrayList.add(1, "江明阳");
        arrayList.add(2, "江明阳");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();
    }
}
