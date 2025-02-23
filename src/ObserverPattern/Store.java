package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImp;
import ObserverPattern.Observer.MobileAlertObserverImp;
import ObserverPattern.Observer.NotififcationAlertObserver;

public class Store {
    public static void main(String []args){
        StockObservable iphoneStockObservale = new IphoneObservableImpl();

        NotififcationAlertObserver observer1 = new EmailAlertObserverImp("1@gmail", iphoneStockObservale);
        NotififcationAlertObserver observer2 = new EmailAlertObserverImp("2@gmail", iphoneStockObservale);
        NotififcationAlertObserver observer3 = new MobileAlertObserverImp("3@gmail", iphoneStockObservale);

        iphoneStockObservale.add(observer1);
        iphoneStockObservale.add(observer2);
        iphoneStockObservale.add(observer3);
        
        iphoneStockObservale.setStockCount(1);
        iphoneStockObservale.setStockCount(0);
        iphoneStockObservale.remove(observer2);
        iphoneStockObservale.setStockCount(2);
    }
}
