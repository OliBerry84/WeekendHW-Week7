package StockItems;

public class Keyboard {

    private String description;
    private int buyPrice;
    private int sellPrice;

    public Keyboard(String type, int buyPrice, int sellPrice){
        this.description = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
