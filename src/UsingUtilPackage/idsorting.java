package UsingUtilPackage;

import java.util.Comparator;

public class idsorting implements Comparator<Employee> {

    @Override
    public int compare(Employee e1,Employee e2){
        return e1.getId()-e2.getId();
    }

}
