package java8prac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class JavaSupplier {
    public static void main(String[] args) {
        Supplier<String>  supplier=() -> "Hi java";
       // System.out.println(supplier.get());
        List<String>  list= Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
