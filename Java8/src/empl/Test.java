package empl;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>();
        createCustomerList(customerList);
        //MAX MIN SAL
        Optional<Customer> highestSal = customerList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Customer::getSalary)));
        Optional<Customer> lowest = customerList.stream().collect(Collectors.minBy((Comparator.comparingDouble(Customer::getSalary))));
    // max sal each dept
        Map<String, Optional<Customer>> mapDept=customerList.stream().collect(Collectors.groupingBy(Customer::getDept,
                Collectors.reducing(BinaryOperator.maxBy((Comparator.comparing(Customer::getSalary))))));
    //    mapDept.forEach((key,value)-> System.out.println(key +" =="+value));
      // print active and in active
        Map<String, Long> acticve = customerList.stream().collect(Collectors.groupingBy(Customer::getActive, Collectors.counting()));
//        System.out.println(acticve);
        // empl count in each dept
        Map<String, Long> collectEmp = customerList.stream().collect(Collectors.groupingBy(Customer::getDept, Collectors.counting()));
//        System.out.println(collectEmp);
        // empl details in each dept
        Map<String, List<Customer>> collectEmpdet = customerList.stream().collect(Collectors.groupingBy(Customer::getDept));
//        System.out.println(collectEmpdet);
        Customer customer = customerList.stream().sorted(Comparator.comparing(Customer::getSalary).reversed()).distinct().skip(1).findFirst().orElseThrow(() -> new IllegalStateException("jajaj"));
//        System.out.println(customer);
        List<Customer> dev = customerList.stream().filter(customer1 -> (customer1.getDept().equals("DEV") && customer1.getSalary() > 60000)).collect(Collectors.toList());
      //  dev.forEach(customer1 -> System.out.println(customer1.getName().toUpperCase()));
        List<Customer> collect = customerList.stream().filter(customer1 -> customer1.getName().equals("ram")).sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
        collect.forEach(customer1 -> System.out.println(customer1));

    }
    private static void createCustomerList(List<Customer> list){
        list.add(new Customer(111,"naveen",32,"YES","HR",2021,20000));
        list.add(new Customer(131,"raju",39,"NO","SALE",2031,90000));
        list.add(new Customer(341,"mohan",62,"YES","DEV",2011,70000));
        list.add(new Customer(101,"karesh",72,"NO","TEST",2021,80000));
        list.add(new Customer(921,"babu",32,"YES","TPM",2017,30000));
        list.add(new Customer(781,"ram",27,"NO","MARKET",2021,50000));
        list.add(new Customer(671,"johny",39,"YES","HR",2018,90000));
        list.add(new Customer(911,"ram",22,"NO","DEV",2020,80000));
    }
}
