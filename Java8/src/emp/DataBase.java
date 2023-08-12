package emp;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(176,"raj","IT",98000));
        list.add(new Employee(378,"raj","ME",927289));
        list.add(new Employee(406,"john","UA",672929));
        list.add(new Employee(981,"nike","EE",40000));
        list.add(new Employee(898,"garg","EE",80000));
        return list;
    }
}
