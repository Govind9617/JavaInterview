package JavaInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prog4 {

    /*

    stream using dub chr and count vowels
     */
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,4,5,6,5,4,5,6);
        List<String> list1=Arrays.asList("amit","john","ram","ram","john","rock");

        Map<Integer, Long> longMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        longMap.forEach((key, value) -> System.out.println(key+" "+value));
        Map<String, Long> longMap1=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        longMap1.forEach((key, value) -> System.out.println(key+" "+value));
        System.out.println(longMap1);
    }
}
