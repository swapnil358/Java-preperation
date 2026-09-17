package JAVA.OOPS.CollectionFramework.comparableVScomparator;

/*Comparable - Comparable is used when a class has a natural or default ordering.
The class implements Comparable<T> and overrides compareTo().*/

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Rahul"));
        employees.add(new Employee(101, "Swapnil"));
        employees.add(new Employee(102, "Amit"));
        employees.add(new Employee(100, "Sandip"));
        Collections.sort(employees);
        System.out.println(employees);
    }
}