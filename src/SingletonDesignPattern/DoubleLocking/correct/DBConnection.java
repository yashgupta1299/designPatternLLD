package SingletonDesignPattern.DoubleLocking.correct;


// 5 by declaring conObject as volatile now it will read and write directly from memry
// and there might by instruction reording but  only before and after volatile
// so in some way we are forcing to follow certain order
public class DBConnection {
    private static volatile DBConnection conObject;
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