package ObserverPattern.Observable;
import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotififcationAlertObserver;

public class IphoneObservableImpl implements StockObservable{
    public List<NotififcationAlertObserver> observerList = new ArrayList<>();
    public int stockCount;
    
    @Override
    public void add(NotififcationAlertObserver observer){
        observerList.add(observer);
    }

    @Override
    public void remove(NotififcationAlertObserver observer){
        observerList.remove(observer); // remove by obj
    }

    @Override
    public void notifySubscribers(){
        for (NotififcationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount){
        stockCount = newStockCount;
        if(stockCount != 0){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}