package behavioral.mediator;

import behavioral.mediator.entities.Colleague;
import behavioral.mediator.entities.StockOffer;

import java.util.ArrayList;
import java.util.List;

public class NYSE implements Mediator {

    private List<Colleague> colleagues;
    private List<StockOffer> sellOffers;
    private List<StockOffer> buyOffers;

    public NYSE() {
        this.colleagues = new ArrayList<>();
        this.sellOffers = new ArrayList<>();
        this.buyOffers = new ArrayList<>();
    }

    private boolean isColleaguePresent(int colleagueId) {
        return this.colleagues.stream()
                .anyMatch((c) -> c.getColleagueCode() == colleagueId);
    }

    private Colleague getColleague(int colleagueId) {
        return this.colleagues.stream()
                .filter((c) -> c.getColleagueCode() == colleagueId)
                .findAny()
                .get();
    }

    private boolean validateOffer(StockOffer offer) {
        return this.sellOffers.stream()
                .anyMatch((o) -> o.equals(offer));
    }

    @Override
    public void saleOffer(StockOffer stockOffer) {
        if (isColleaguePresent(stockOffer.getSellerId())) {
            this.sellOffers.add(stockOffer);
        }
    }

    @Override
    public void buyOffer(StockOffer stockOffer) {
        if (isColleaguePresent(stockOffer.getSellerId())) {
            if(this.validateOffer(stockOffer)){
                this.buyOffers.add(stockOffer);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void showAllOffers(){
        System.out.println("Sell Offers: ");
        for (StockOffer sellOffer : this.sellOffers) {
            System.out.println(sellOffer);
        }
        System.out.println();
        System.out.println("Buy Offers: ");
        for (StockOffer buyOffer : buyOffers) {
            System.out.println(buyOffer);
        }
    }
}
