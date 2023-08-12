package JavaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Prog1 {
    public static void main(String[] args) {
        List<Employee1> emplList=new ArrayList<>();
        createEmpList(emplList);
        Map<String, List<Employee1>> collectEmp = emplList.stream().collect(Collectors.groupingBy(Employee1::getCity));
        System.out.println(collectEmp);
    }
    private static void createEmpList(List<Employee1> empls){
        Employee1 empl1=new Employee1();
        empl1.setName("raju");
        empl1.setCity("HYD");
        empl1.setId("1");

        Employee1 empl2=new Employee1();
        empl1.setName("yay");
        empl1.setCity("che");
        empl1.setId("2");

        Employee1 empl3=new Employee1();
        empl1.setName("sff");
        empl1.setCity("HoaiYD");
        empl1.setId("3");

        Employee1 empl4=new Employee1();
        empl1.setName("ram");
        empl1.setCity("BAN");
        empl1.setId("4");

        Employee1 empl5=new Employee1();
        empl1.setName("riw");
        empl1.setCity("BAN");
        empl1.setId("5");

        empls.add(empl1);
        empls.add(empl2);
        empls.add(empl3);
        empls.add(empl4);
        empls.add(empl5);


    }

}
