package MediatorDesignPattern.Mediator;

import MediatorDesignPattern.Colleague.Colleague;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Colleague bidder, int amount);
}
