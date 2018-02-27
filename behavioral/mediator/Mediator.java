package behavioral.mediator;

import behavioral.mediator.entities.Colleague;
import behavioral.mediator.entities.StockOffer;

public interface Mediator {

    void saleOffer(StockOffer stockOffer);

    void buyOffer(StockOffer stockOffer);

    void addColleague(Colleague colleague);

    void showAllOffers();
}
