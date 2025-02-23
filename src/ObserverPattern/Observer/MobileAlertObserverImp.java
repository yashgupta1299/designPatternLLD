package ObserverPattern.Observer;
import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImp implements NotififcationAlertObserver {
    String emailId;
    StockObservable observable;    

    public MobileAlertObserverImp(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    
    @Override
    public void update(){
        System.out.println("Stock count is " + this.observable.getStockCount() + ": Mobile message sent " + emailId);
    }
}
