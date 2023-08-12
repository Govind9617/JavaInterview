package JavaInterview;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class Prog2 {
    public static void main(String[] args) {
        String[] strings={"amit","ball","call","amit"};
//      Stream<String> stringStream= Arrays.asList(strings).stream();
//        stringStream.forEach(System.out::println);
//        long c=stringStream.filter(s -> s.equals("amit")).count();
//        System.out.println(c);
        Supplier<Stream<String>> supplier=()->Stream.of(strings);
        supplier.get().forEach(ex-> System.out.println(ex));
        long c=supplier.get().filter(s -> "amit".equals(s)).count();
        System.out.println(c);
    }
}

