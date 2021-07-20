package HarishPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args){
        Employee e1  = new Employee(1,"Harish",100000);
        Employee e2  = new Employee(2,"Sai",19000);
        Employee e3  = new Employee(3,"Mike",10000);

        List<Employee> employee = new ArrayList<Employee>();
        employee.add(e2);
        employee.add(e1);
        employee.add(e3);

        System.out.println(employee);

        Collections.sort(employee,new SalarySort());
        System.out.println(employee);

    }
}
