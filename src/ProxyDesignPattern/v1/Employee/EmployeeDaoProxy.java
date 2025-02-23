package ProxyDesignPattern.v1.Employee;
import ProxyDesignPattern.v1.Emp;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao EmployeeDaoObj;
    public EmployeeDaoProxy(){
        this.EmployeeDaoObj = new EmployeeDaoImp();
    }

    @Override
    public void create(String client, Emp obj) throws Exception{
        if(client.equals("ADMIN")){
            EmployeeDaoObj.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }
    
    @Override
    public void delete(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN")){
            EmployeeDaoObj.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Emp get(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN") || client.equals("USER")){
            return EmployeeDaoObj.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
