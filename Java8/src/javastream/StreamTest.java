package javastream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("john");
        list.add("jacob");
        list.add("ajja");
        list.add("batista");
        list.add("rock");
        for (String s : list) {
//            System.out.println(s);
        }
 //       list.stream().filter(s -> s.startsWith("j") && (s.endsWith("b")||s.endsWith("n"))).forEach(s -> System.out.println(s));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "c");
//        map.entrySet().stream().forEach(integerStringEntry -> System.out.println(integerStringEntry.getValue()));
        map.entrySet().stream().filter(integerStringEntry -> integerStringEntry.getKey()==2).forEach(integerStringEntry -> System.out.println(integerStringEntry.getValue()));

    }
}
