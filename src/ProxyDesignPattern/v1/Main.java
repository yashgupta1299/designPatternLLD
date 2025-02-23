package ProxyDesignPattern.v1;

import ProxyDesignPattern.v1.Employee.EmployeeDao;
import ProxyDesignPattern.v1.Employee.EmployeeDaoProxy;

public class Main {

    public static void main(String []args){
        try {
            EmployeeDao employeeDaoObj = new EmployeeDaoProxy();
            // employeeDaoObj.create("USER", new Emp());
            employeeDaoObj.create("ADMIN", new Emp());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}