package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

   private String description;


    public Guitar(String material, String colour, String type, String description, int buyingPrice, int sellingPrice) {
        super(material, colour, type, buyingPrice, sellingPrice);

        this.description = description;

    }

    public String getDescription() {
        return description;
    }


}
