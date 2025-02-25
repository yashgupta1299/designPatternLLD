package SingletonDesignPattern.DoubleLocking.issue;


// 4. Issue is in multithread environment conObject might get its
// referene alloted before some initialization 
// (due to reordring of instructions while initializing connection) 
// so next thread will see conObject is not null in outer condition but it was
// wrong and return conObject which was not properly initialized
// and other thing is the connection might be in cache and not in write memory
// (in disk) so other thread will go ahead and initialize another
// connection

public class DBConnection {
    private static DBConnection conObject;
    private int memberVariable;
    private DBConnection(int memberVariable){
        this.memberVariable = memberVariable;
    }

    public static DBConnection getInstance(){
        if(conObject == null){
            synchronized (DBConnection.class){
                if(conObject == null){
                    conObject = new DBConnection(10);
                }
            }
        }
        return conObject;
    }
}