package day20.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/10/13:37
 * @Description:
 */
public class OrderedStream {
    String[] orderedStreams;

    public OrderedStream(int n) {
        orderedStreams = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        orderedStreams[idKey - 1] = value;

        ArrayList<String> strings = new ArrayList<String>() {
        };

        if (idKey < orderedStreams.length - 1 && orderedStreams[idKey] != null) {
            for (int i = idKey - 1; orderedStreams[i] != null; i++) {
                strings.add(orderedStreams[i]);
            }

            return strings;
        } else {
            if (idKey == 1)
                strings.add(value);

            if (idKey == orderedStreams.length) {
                strings.add(value);
                return new ArrayList<String>() {
                };
            }

            return strings;
        }


    }

    public static void main(String[] args) {
        OrderedStream orderedStream = new OrderedStream(5);

        for (String c : orderedStream.insert(3, "ccccc")) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (String a : orderedStream.insert(1, "aaaaa")) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (String c : orderedStream.insert(2, "bbbbb")) {
            System.out.print(c + " ");
        }

        System.out.println();

        for (String e : orderedStream.insert(5, "eeeee")) {
            System.out.print(e + " ");
        }

        System.out.println();

        for (String d : orderedStream.insert(4, "ddddd")) {
            System.out.print(d + " ");
        }

    }
}
