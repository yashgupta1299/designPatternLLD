package MediatorDesignPattern.Colleague;

public interface Colleague {
    public void placeBid(int bidAmount);
    public void recieveBidNotification(int bidAmount);
    public String getName();
}
