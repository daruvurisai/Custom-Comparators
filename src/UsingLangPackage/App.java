package UsingLangPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Employee e1  = new Employee(1,"abhinav",60000);
        Employee e2 = new Employee(2,"harish", 95000);
        Employee e3 = new Employee(3,"sai", 75000);
        Employee e4 = new Employee(4,"naveen", 85000);

        List<Employee> employees  = new ArrayList<Employee>();
        employees.add(e4);
        employees.add(e2);
        employees.add(e1);
        employees.add(e3);

        //Unsorted list
        System.out.println(employees);

        //Sorted list
        Collections.sort(employees);

        System.out.println("Employees based on Salary order");
        System.out.println(employees);

    }
}
