package StockItems;

public class GuitarStrings {
    
    private String description;
    private int buyPrice;
    private int sellPrice;
    
    public GuitarStrings(String description, int buyPrice, int sellPrice){
        this.description = description;
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
