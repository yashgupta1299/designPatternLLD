package IteratorDesignPattern.Aggregate;

import java.util.List;

import IteratorDesignPattern.Employee;
import IteratorDesignPattern.Iterator.EmployeeIterator;
import IteratorDesignPattern.Iterator.MyIterator;

// public class Company implements Aggregate<Employee>{
public class Company implements Aggregate<Employee>{
    private List<Employee> employees;
    public Company(List<Employee> employees){
        this.employees = employees;
    }    

    @Override
    public MyIterator<Employee> createIterator(){
        return new EmployeeIterator(employees);
    }
}
