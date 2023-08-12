package JavaInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ArrayDemo {
//    public static void main(String[] args) {
//        int[] arr={3,4,3,6,8,2,2,9};
//        int first = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("no"));
//        System.out.println(first);
//    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int[] arr1={ 4,5,6,7,8};
    List<Integer> collect = Arrays.stream(arr).filter(value -> Arrays.stream(arr1).anyMatch(value1 -> value1 == value)).boxed().collect(Collectors.toList());
    System.out.println(collect);
}
}
