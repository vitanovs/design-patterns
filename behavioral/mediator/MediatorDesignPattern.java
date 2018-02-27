package behavioral.mediator;

import behavioral.mediator.entities.AmatureColleague;
import behavioral.mediator.entities.Colleague;
import behavioral.mediator.entities.ProColleague;

public class MediatorDesignPattern {
    public static void main(String[] args) {

        Mediator nyse = new NYSE();

        Colleague broker1 = new ProColleague(nyse, "Broker1");
        Colleague broker2 = new AmatureColleague(nyse, "Broker2");


        broker1.saleOffer("APPL", 100, 123.5, 0);
        broker1.saleOffer("GOOG", 50, 155.87, 0);

        broker2.buyOffer("APPL", 100, 123.5,0);
        broker2.saleOffer("MSFT", 150, 97.88, 1);
        broker2.saleOffer("FB", 55, 117.63, 1);


        nyse.showAllOffers();
    }
}
