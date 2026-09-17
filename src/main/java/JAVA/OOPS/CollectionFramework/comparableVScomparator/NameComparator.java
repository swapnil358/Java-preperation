package JAVA.OOPS.CollectionFramework.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.name.compareTo(e2.name);
    }

    public static void main(String[] args) {

        // Create Employee list
        List<Employee> employees = new ArrayList<>();

        // Add employees
        employees.add(new Employee(103, "Rahul"));
        employees.add(new Employee(101, "Swapnil"));
        employees.add(new Employee(102, "Amit"));
        employees.add(new Employee(99, "Zamit"));

        // Sort employees by name
        Collections.sort(employees, new NameComparator());

        // Print employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}