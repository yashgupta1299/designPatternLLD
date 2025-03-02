package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;
import IteratorDesignPattern.Iterator.MyIterator;
import IteratorDesignPattern.Aggregate.Company;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("yash"));
        employees.add(new Employee("bhanu"));
        employees.add(new Employee("abhay"));

        Company company = new Company(employees);
        MyIterator<Employee> iterator = company.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
