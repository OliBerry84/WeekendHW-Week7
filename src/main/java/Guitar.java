public class Guitar extends Instrument{

    private String colour;
    private int strings;

    public Guitar(String type, String make, String model, String colour, int strings, int price) {
        super(type, make, model, price);
        this.colour = colour;
        this.strings = strings;
        }

    public String getColour() {
        return colour;
    }

    public int getStrings() {
        return strings;
    }

    public String play(String sound){
        return "This instrument goes " + sound;
    }

}
