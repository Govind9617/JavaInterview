package java8prac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaConsumer {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("print " + t);
        consumer.accept(10);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().forEach(t-> System.out.print(" "+t));
    }
}
