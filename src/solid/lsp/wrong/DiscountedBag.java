package solid.lsp.wrong;

public class DiscountedBag extends Bag {

    private double discountedRate = 0;

    public void setDiscountedRate(double discountedRate) {
        this.discountedRate = discountedRate;
    }

    public void applyDiscount(int price) {
        super.setPrice(price - (int) (discountedRate * price));
    }

    public void setPrice(int price) {
        super.setPrice(price - (int)(discountedRate * price));
    }
}
