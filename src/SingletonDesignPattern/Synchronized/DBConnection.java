package SingletonDesignPattern.Synchronized;


// 3. thread problem but synchronized cost a lot of time 
// a lot of threads neads to wait for lock realeased
// before taking it
public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){

    }

    synchronized public static DBConnection getInstance(){
        if(conObject == null){
            conObject = new DBConnection();
        }
        return conObject;
    }
}