public class Piano extends Instrument{

    private String colour;
    private int keys;

    public Piano(String type, String make, String model, String colour, int keys, int price){
        super(type, make, model, price);
        this.colour = colour;
        this.keys = keys;
    }

    public String getColour() {
        return colour;
    }

    public int getKeys() {
        return keys;
    }

}
