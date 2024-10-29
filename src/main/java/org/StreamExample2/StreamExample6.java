package org.StreamExample2;

import java.util.Map;

//Упр.6. Дан Map<String, Integer>, где ключи — это названия товаров, а значения — их цены.
// Написать метод, который используя Stream,
// находит общую сумму цен всех товаров.
// Покрыть тестами
public class StreamExample6 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("Хлеб", 100, "Сахар", 50, "Молоко", 100);
        countToReduce(map1);

    }

    public static int countToReduce(Map<String, Integer> map) {
        long res2 = map.values().stream().reduce(0, (y, x) -> y + x);
        System.out.println("Сумма товаров = " + res2);
        return (int)res2;
    }
}


