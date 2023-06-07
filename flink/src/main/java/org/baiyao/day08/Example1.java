package org.baiyao.day08;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/05/13/20:28
 * @Description: 拓扑排序
 *      B   D
 *  A
 *      C   E
 */
public class Example1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();

        ArrayList<String> neighborsOfA = new ArrayList<>();
        neighborsOfA.add("B");
        neighborsOfA.add("C");

        ArrayList<String> neighborsOfB = new ArrayList<>();
        neighborsOfB.add("C");
        neighborsOfB.add("D");
        neighborsOfB.add("E");

        ArrayList<String> neighborsOfC = new ArrayList<>();
        neighborsOfC.add("B");
        neighborsOfC.add("D");
        neighborsOfC.add("E");

        stringArrayListHashMap.put("A", neighborsOfA);
        stringArrayListHashMap.put("B", neighborsOfB);
        stringArrayListHashMap.put("C", neighborsOfC);

        topologicalSort(stringArrayListHashMap, "A", "A");
    }

    private static String topologicalSort(HashMap<String, ArrayList<String>> hashMap, String vertex, String route) {
        if (vertex == "D" || vertex == "E") {
            return route;
        } else {
            ArrayList<String> nighbors = hashMap.get(vertex);
        }

        return "";

//        for (int i = 0; i < nighbors.size(); i++) {
//            topologicalSort(hashMap, nighbors.get(i), route + " -> " + nighbors.get(i));
//        }
//        return topologicalSort();
    }
}
