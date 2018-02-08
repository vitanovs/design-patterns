package behavioral.observer;


import behavioral.observer.entities.Observer;
import behavioral.observer.entities.StockMarket;
import behavioral.observer.entities.Trader;

public class ObserverDesignPattern {
    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer trader1 = new Trader(market);

        market.setApplPrice(100.98);
        market.setApplPrice(126.78);
        market.setApplPrice(116.98);
        market.setGoogPrice(87.85);
        market.setIbmPrice(89.67);
        market.setGoogPrice(158.96);
        market.setApplPrice(125.71);
        market.setIbmPrice(115.76);

    }
}
