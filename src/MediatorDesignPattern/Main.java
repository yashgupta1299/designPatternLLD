package MediatorDesignPattern;

import MediatorDesignPattern.Mediator.AuctionMediator;
import MediatorDesignPattern.Colleague.Bidder;
import MediatorDesignPattern.Colleague.Colleague;
import MediatorDesignPattern.Mediator.Auction;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        
        Colleague bidder1 = new Bidder(auctionMediator, "A");
        Colleague bidder2 = new Bidder(auctionMediator, "B");
        Colleague bidder3 = new Bidder(auctionMediator, "C");
        Colleague bidder4 = new Bidder(auctionMediator, "D");

        // bidder1.placeBid(22);
        bidder2.placeBid(30);
        // bidder1.placeBid(30);
    }
}
