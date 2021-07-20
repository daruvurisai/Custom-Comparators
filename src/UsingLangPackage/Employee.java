package UsingLangPackage;

import java.lang.Comparable;
public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int salary;

    //Constructor
    public Employee(int id , String nameE , int sal){
        this.id=id;
        this.name=nameE;
        this.salary=sal;
    }
    @Override
    public int compareTo(Employee o){
        return this.salary-o.salary;
    }
    @Override
    public String toString(){
        return "Employee : "+id+"---"+ name + "---"+ salary +".";
    }
}

