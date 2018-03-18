package StockItems;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Keyboard implements ISell, IPlay{

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

    public int calculateMarkUp(int buyPrice, int sellPrice) {
        return this.sellPrice - this.buyPrice;
    }

    public String play(String sound){
        return "This instrument goes " + sound;
    }
}
