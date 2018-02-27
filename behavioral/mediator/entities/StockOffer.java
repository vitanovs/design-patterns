package behavioral.mediator.entities;

public class StockOffer {

    private String signature;
    private int shares;
    private double price;
    private int sellerId;

    public StockOffer(String signature, int shares, double price, int sellerId) {
        this.signature = signature;
        this.shares = shares;
        this.price = price;
        this.sellerId = sellerId;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(Object o) {
        if (!o.getClass().getSimpleName().equals(StockOffer.class.getSimpleName())) {
            return false;
        }

        StockOffer stockOffer = (StockOffer) o;

        boolean isPriceSame = this.getPrice() == stockOffer.getPrice();
        boolean isSignatureSame = this.getSignature().equals(stockOffer.getSignature());
        boolean isSharesSame = this.getShares() == stockOffer.getShares();

        if (isPriceSame && isSharesSame && isSignatureSame) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.getShares() + " shares of " + this.getSignature() + ", for " +
                String.format("$%.2f, from broker %d", this.getPrice(), this.sellerId);
    }
}