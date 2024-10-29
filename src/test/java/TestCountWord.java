import org.StreamExample2.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static org.StreamExample2.StreamExample6.countToReduce;

public class TestCountWord {
    @Test
    public void testCountWords1() {
        String[] arr = {"Aaaaa", "Bb", "Cccc", "Dd", "Eeeee"};
        Assertions.assertEquals(2, Main.countWord(arr));
    }

    @Test
    public void testCountWords2() {
        String[] arr = {null, null};
        Assertions.assertEquals(0, Main.countWord(arr));
    }

    @Test
    public void testCountWords3() {
        String[] arr = {};
        Assertions.assertEquals(0, Main.countWord(arr));
    }

    @Test
    public void testCountWords4() {
        Map<String, Integer> map1 = Map.of("Хлеб", 100, "Сахар", 50, "Молоко", 100);
        Assertions.assertEquals(250, countToReduce(map1));
    }


    @Test
    public void testCountWords5() {
        Map<String, Integer> map1 = Map.of("Хлеб", 0, "Сахар", 0, "Молоко", 0);
        Assertions.assertEquals(0, countToReduce(map1));
    }


    @Test
    public void testCountWords6() {
        Map<String, Integer> map1 = Map.of("Хлеб", -100, "Сахар", -50, "Молоко", -100);
        Assertions.assertEquals(-250, countToReduce(map1));
    }

    @Test
    public void testCountWords7() {
        Map<String, Integer> map1 = Map.of();
        Assertions.assertEquals(0, countToReduce(map1));
    }

    @Test
    public void streamTest14() {
        Map<String, Integer> map1 = Map.of("Хлеб", 100, "Сахар", 0, "Молоко", 100);
        Assertions.assertEquals(200, countToReduce(map1));
    }
}
