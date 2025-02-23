package ObserverPattern.Observer;
import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImp implements NotififcationAlertObserver {
    String emailId;
    StockObservable observable;    

    public EmailAlertObserverImp(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    
    @Override
    public void update(){
        System.out.println("Stock count is " + this.observable.getStockCount() + ": Email Sent to " + emailId);
    }
}
