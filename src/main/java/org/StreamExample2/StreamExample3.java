package org.StreamExample2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(4, 5, 6, 2, 9, 4).collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set1 = Stream.of(4, 5, 6, 2, 9, 4).collect(Collectors.toSet());
        System.out.println(set1);


        long res = Stream.of(4, 5, 6, 2, 9, 2, 4).collect(Collectors.counting());
        System.out.println(res);


        String res1 = Stream.of("банан", "киви", "арбуз").collect(Collectors.joining("-"));
        System.out.println(res1);



    }
}
