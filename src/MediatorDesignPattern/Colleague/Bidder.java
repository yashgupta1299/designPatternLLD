package MediatorDesignPattern.Colleague;

import MediatorDesignPattern.Mediator.AuctionMediator;

public class Bidder implements Colleague{
    AuctionMediator auctionMediator;
    String name;
    public Bidder(AuctionMediator auctionMediator, String name){
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int bidAmount){
        auctionMediator.placeBid(this, bidAmount);
    }
    @Override
    public void recieveBidNotification(int bidAmount){
        System.out.println("Bidder: " + name + " got the notification that someone has put a bid of " + bidAmount);
    }
    @Override
    public String getName(){
        return name;
    }
}