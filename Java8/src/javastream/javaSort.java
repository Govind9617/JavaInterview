package javastream;

import emp.DataBase;
import emp.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class javaSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(12);
        list.add(2);
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
        //       list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s));
        //list.stream().sorted().forEach(s-> System.out.print(s+" "));
        List<Employee> employees = DataBase.getEmployee();
//        employees.stream().filter(employee -> (employee.getSalary() > 500000 && employee.getName().equals("ram"))).forEach(s -> System.out.println(s.getDept()));
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

    }
}
