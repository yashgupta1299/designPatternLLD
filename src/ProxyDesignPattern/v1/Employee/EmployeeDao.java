package ProxyDesignPattern.v1.Employee;
import ProxyDesignPattern.v1.Emp;

public interface EmployeeDao {
    public void create(String client, Emp obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public Emp get(String client, int employeeId) throws Exception;
}
