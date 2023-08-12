package optional;


import emp.DataBase;

import java.util.Arrays;
import java.util.Optional;

public class JavaOpt {
    public static void main(String[] args) {
        Customer customer=new Customer(101,"john","null", Arrays.asList("86618368163","8172871836816"));

      // Optional<String> email = Optional.of(customer.getEmail());
     //  Optional<String> optional=Optional.ofNullable(customer.getEmail());
      //  System.out.println(optional);
        Double avgSal=DataBase.getEmployee().stream().filter(employee -> employee.getDept().equals("EE"))
                .map(employee -> employee.getSalary()).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avgSal);
        Double avgSum=DataBase.getEmployee().stream().filter(employee -> employee.getDept().equals("EE"))
                .map(employee -> employee.getSalary()).mapToDouble(i->i).sum();
        System.out.println(avgSum);
    }

}
