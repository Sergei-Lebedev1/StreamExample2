package org.StreamExample2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("one", 1, "two", 2, "three", 3,"six",6);
        long res1 = map1.keySet().stream().filter(x -> x.length() < 4).count();
        System.out.println(res1);

        long res2 = map1.values().stream().filter(x -> x < 3).count();
        System.out.println(res2);

        long res3 = map1.entrySet().stream().filter(x -> x.getKey().length() > 3 && x.getValue() > 1).count();
        System.out.println(res3);

        Map<String, Integer> filterMap = map1.entrySet().stream().filter(x -> x.getValue() > 2).collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue()
        ));
        System.out.println(filterMap);
    }

}
