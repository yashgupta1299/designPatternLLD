package SingletonDesignPattern.DoubleLocking.issue;

public class Main {
    public static void main(String[] args) {
        DBConnection conObject = DBConnection.getInstance();
    }
}
