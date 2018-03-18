import Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell{

    private String name;
    private int buyPrice;
    private int sellPrice;
    private ArrayList<ISell> stock;

    public Shop(String name, int buyPrice, int sellPrice){
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stock = new ArrayList<ISell>();
    }

    public void calculateMarkUp(ISell stock){
        this.stock.add(stock);
    }

    public void calculateMarkUp(ISell stock){
        this.stock.remove(stock);
    }

    @Override
    public int calculateMarkUp(int buyPrice, int sellPrice) {
        return this.sellPrice - this.buyPrice;
    }
}
