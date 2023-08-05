package java8prac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(9));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(integer -> (integer % 2 == 0)).forEach(System.out::println);
    }
}

