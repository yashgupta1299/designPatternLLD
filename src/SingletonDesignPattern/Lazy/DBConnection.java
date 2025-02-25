package SingletonDesignPattern.Lazy;


// 2. thread problem let say if two thread 
// comes simultaneously then they end up getting two instance
public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}