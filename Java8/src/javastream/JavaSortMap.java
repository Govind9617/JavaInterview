package javastream;

import emp.Employee;

import java.util.*;

public class JavaSortMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("john",1);
        map.put("ram",5);
        map.put("rock",9);
        map.put("gold",2);
//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
        Map<Employee,Integer> list=new HashMap<>();
        list.put(new Employee(176,"raj","IT",98000),60);
        list.put(new Employee(378,"ram","ME",927289),90);
        list.put(new Employee(406,"john","UA",672929),80);
        list.put(new Employee(981,"nike","EC",462782),50);
        list.put(new Employee(898,"garg","EC",82872),50);
//        list.entrySet().stream().filter(e->e.getKey().getName().equals("ram")).forEach(e-> System.out.println(e.getValue()));
        list.entrySet().stream().filter(s->s.getKey().getDept().equals("EC")).sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
    }
}
