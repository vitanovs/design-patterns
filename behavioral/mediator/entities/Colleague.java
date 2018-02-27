package behavioral.mediator.entities;

import behavioral.mediator.Mediator;

public abstract class Colleague {

    private static int COLLEAGUES_COUNT = 0;

    private Mediator mediator;
    private int colleagueCode;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.colleagueCode = COLLEAGUES_COUNT;
        this.mediator.addColleague(this);
        COLLEAGUES_COUNT++;
    }

    public void saleOffer(String signature, int shares, double price, int colleagueCode) {
        mediator.saleOffer(new StockOffer(signature, shares, price, colleagueCode));
    }

    public void buyOffer(String signature, int shares, double price, int colleagueCode) {
        mediator.buyOffer(new StockOffer(signature, shares, price, colleagueCode));
    }

    public String getName() {
        return name;
    }

    public int getColleagueCode(){
        return this.colleagueCode;
    }

}
