package emp;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(176,"raj","IT",98000));
        list.add(new Employee(378,"ram","ME",927289));
        list.add(new Employee(406,"john","UA",672929));
        list.add(new Employee(981,"nike","EE",462782));
        list.add(new Employee(898,"garg","EC",82872));
        return list;
    }
}
