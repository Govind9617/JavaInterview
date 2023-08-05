package emp;

import java.util.List;
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
        System.out.println(taxEmp("tax"));

    }
}
