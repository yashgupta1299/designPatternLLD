package IteratorDesignPattern.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

import IteratorDesignPattern.Employee;

public class EmployeeIterator implements MyIterator<Employee>{
    private List<Employee> employees;
    private int currentInd;
    public EmployeeIterator(List<Employee> employees){
        this.employees = employees;
    }

    @Override
    public boolean hasNext(){
        return currentInd < employees.size();
    }
    
    @Override
    public Employee next(){
        if(!hasNext()){
            throw new NoSuchElementException(); // or return null
        }
        return employees.get(currentInd++);
    }
}
