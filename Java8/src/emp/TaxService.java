package emp;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> taxEmp(String tax) {
//        if(tax.equalsIgnoreCase("tax"))
//            return DataBase.getEmployee().stream().filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList());
//        return DataBase.getEmployee().stream().filter(employee -> employee.getSalary() < 500000).collect(Collectors.toList());
        return tax.equalsIgnoreCase("tax")?DataBase.getEmployee().stream().filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList()):
                DataBase.getEmployee().stream().filter(employee -> employee.getSalary() < 500000).collect(Collectors.toList());

    }


    public static void main(String[] args) {
//        System.out.println(taxEmp("tax"));
        Map<String, List<Employee>> collect = DataBase.getEmployee().stream().collect(Collectors.groupingBy(Employee::getDept));
//        collect.forEach((key,value)-> System.out.println("dept "+key+" Empl"+value));
//        List<Employee> collect1 = DataBase.getEmployee().stream().sorted(Comparator.comparing(Employee::getId).reversed()).collect(Collectors.toList());
        List<Employee> collect1 = DataBase.getEmployee().stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        List<Employee> employees=DataBase.getEmployee().stream().sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getName)).toList();
        System.out.println(employees);



    }
}
