public class MarketGood {
    public final String name;  // 상품의 이름
    public final int retailPrice;  //상품의 출시 가격
    private int discountRate;  //상품의 할인율. 단위: %

    public MarketGood(String name, int retailPrice) { this(name, retailPrice, 0); }

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public int getDiscountRate() { return this.discountRate; }

    public void setDiscountRate(int discountRate) { this.discountRate = discountRate; }

    public int getDiscountedPrice() { return (int) (retailPrice * (1 - discountRate / 100.0)); }
}
