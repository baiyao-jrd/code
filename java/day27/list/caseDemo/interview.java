package day27.list.caseDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/18/15:12
 * @Description:
 */
public class interview {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 2; i < 100; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list.add(i);
            }
        }

        for (Object o : list) {
            System.out.print(o + " ");
        }

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            if ((int)iterator.next() % 10 == 3) {
                iterator.remove();
            }
        }

        System.out.println();

        for (Object o : list) {
            System.out.print(o + " ");
        }

        System.out.println("\n***************************************");

        List arrayList = new ArrayList();

        for (int i = 0; i < 10; i++) {
            arrayList.add(new Random().nextInt(100));
        }

        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        list.retainAll(arrayList);

        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
