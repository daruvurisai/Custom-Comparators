package UsingUtilPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args)  {
        Employee e1 = new Employee(1, "abhinav", 60000);
        Employee e2 = new Employee(2, "harish", 95000);
        Employee e3 = new Employee(3, "sai", 75000);
        Employee e4 = new Employee(4, "naveen", 85000);
        Employee e5 = new Employee(5, "harish1", 89000);
        List<Employee> employees = new ArrayList<Employee>();
        //USing addall Method for adding all the objects into
        //addall(collectionname, o1,o2,o3);
        Collections.addAll(employees,e1,e2,e3,e4,e5);
        //Unsorted list
        System.out.println(employees);

        //Sorted list Using Salary
        Collections.sort(employees,new SalarySorting());

        System.out.println("Employees based on Salary");
        System.out.println(employees);

        //Sorted list using Id

        Collections.sort(employees,new idsorting());
        System.out.println("Employees based on Id");
        System.out.println(employees);

        //Sorted using name
        Collections.sort(employees,new NameSorting());
        System.out.println("Employees based on Name");
        System.out.println(employees);

    }
}
