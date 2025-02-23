package ObserverPattern.Observable;
import ObserverPattern.Observer.NotififcationAlertObserver;

public interface StockObservable {
    public void add(NotififcationAlertObserver observer);
    public void remove(NotififcationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}