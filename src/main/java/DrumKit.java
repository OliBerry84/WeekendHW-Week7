import Interfaces.IPlay;

public class DrumKit extends Instrument implements IPlay {

    private String make;
    private String model;
    private int price;

    public DrumKit(String type, String make, String model, int price){
        super(type, make, model, price);
        }


        public String play(String sound){
        return "This instrument goes " + sound;
        }

}