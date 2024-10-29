package org.StreamExample2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Создать класс Flower,
// который содержит два поля – название цветка и количество нектара (int).
// Также класс содержит метод, возвращающий значение поля «количество нектара».
// В main создать ArrayList из цветков.
// С помощью stream отфильтровать те цветы,
// количество нектара у которых больше указанного числа.
// Вывести в консоль.
public class StreamExample7 {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower("Роза", 10));
        flowers.add(new Flower("Тюльпан", 15));
        flowers.add(new Flower("Ромашка", 5));
        flowers.add(new Flower("Подсолнух", 20));
        flowers.add(new Flower("Хризантема", 25));

        List<Flower> filteredFlowers = flowers.stream().filter(flower -> flower.getNectar() > 10).collect(Collectors.toList());
        filteredFlowers.forEach(System.out::println);

    }
}


