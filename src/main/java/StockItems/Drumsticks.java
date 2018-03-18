package StockItems;

import Interfaces.ISell;

public class Drumsticks {

    private String description;
    private int buyPrice;
    private int sellPrice;
    private ISell markup;

    public Drumsticks(String type, int buyPrice, int sellPrice, ISell markup){
        this.description = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.markup = markup;
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

    public void setMarkUp(ISell markup){
        this.markup = markup;
    }

    public int calculateMarkUp(int buyPrice, int sellPrice) {
        return markup.calculateMarkUp(buyPrice, sellPrice);
    }
}