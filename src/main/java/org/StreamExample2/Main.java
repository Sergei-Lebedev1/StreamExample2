package org.StreamExample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"яблоко", "апельсин", "банан", "киви", "арбуз"};
        System.out.println(countWord(arr));


    }

    public static int countWord(String[] arr) {

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
        Stream<String> str1 = list2.stream();
        long res = str1.filter(x -> x != null && x.length() > 4).count();
        return (int) res;
    }
}