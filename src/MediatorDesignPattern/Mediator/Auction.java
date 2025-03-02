package MediatorDesignPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

import MediatorDesignPattern.Colleague.Colleague;

public class Auction implements AuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder){
        colleagues.add(bidder);
    }
    @Override
    public void placeBid(Colleague bidder, int amount){
        for (Colleague colleague : colleagues) {
            if(!colleague.getName().equals(bidder.getName())){
                colleague.recieveBidNotification(amount);
            }
        }
    }
}
