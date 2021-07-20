package UsingUtilPackage;

public class Employee {

   private int id;
   private String name;
   private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
