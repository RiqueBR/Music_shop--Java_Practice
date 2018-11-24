package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String description;
    private int buyingPrice;
    private int sellingPrice;

    public Piano(String material, String colour, String type, String description, int buyingPrice, int sellingPrice) {
        super(material, colour, type, buyingPrice, sellingPrice);

        this.description = description;

    }

    public String getDescription() {
        return description;
    }

}
