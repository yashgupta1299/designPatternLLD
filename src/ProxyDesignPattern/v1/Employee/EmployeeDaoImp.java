package ProxyDesignPattern.v1.Employee;
import ProxyDesignPattern.v1.Emp;

public class EmployeeDaoImp implements EmployeeDao{

    @Override
    public void create(String client, Emp obj) throws Exception{
        System.out.println("created new row in the employee table");
    }
    
    @Override
    public void delete(String client, int employeeId) throws Exception{
        System.out.println("deleted row with employeeId:" + employeeId);
    }

    @Override
    public Emp get(String client, int employeeId) throws Exception{
        System.out.println("Fetching data from the api");
        return new Emp();
    }
}
