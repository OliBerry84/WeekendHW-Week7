public abstract class Instrument {

    private String type;
    private String make;
    private String model;
    private int price;

    public Instrument(String type, String make, String model, int price){
        this.type = type;
        this.make = make;
        this.model = model;
        this.price = price;
    }
    public String getType(){
        return type;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }
}
