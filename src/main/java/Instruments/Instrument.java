package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private String type;
    private int sellingPrice;
    private int buyingPrice;


    public Instrument(String material, String colour, String type, int buyingPrice, int sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public String playTune(String sound) {
        return sound;
    }

    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
