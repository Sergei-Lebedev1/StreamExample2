package org.StreamExample2;
//Упр.5. Дан Map<String, Integer>,
// представляющий товары и их цены.
// Увеличьте цену каждого товара на 10% и верните новый Map с обновленными ценами.

import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample5 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("Хлеб", 100, "Сахар", 50, "Молоко", 100);
        Map<String, Integer> filterMap = map1.entrySet().stream().collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue() + entry.getValue() / 10
        ));
        System.out.println(filterMap);
    }

}

