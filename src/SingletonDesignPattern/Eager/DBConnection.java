package SingletonDesignPattern.Eager;

// 1. we are creating the connection at the time 
// of initialization but rather we should
// initialize when we need that resource
public class DBConnection {
    private static DBConnection conObject = new DBConnection();
    private DBConnection(){
    }

    public static DBConnection getInstance(){
        return conObject;
    }
}