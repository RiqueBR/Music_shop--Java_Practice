package Shops;
import Behaviours.ISell;
import Instruments.Instrument;

import java.util.ArrayList;

public class MusicShop implements ISell{

    private ArrayList<ISell> stock;

    public MusicShop() {
        stock = new ArrayList<ISell>();
    }

    public int checkStock(){
        return stock.size();
    }

    public void addItem(ISell instrument){
        this.stock.add(instrument);
    }

    public void removeItem(ISell instrument){
        this.stock.remove(instrument);
    }


    public double calculateMarkup() {
        double totalValue = 0;

        for(ISell instrument : this.stock){
            totalValue += instrument.calculateMarkup();
        }
        return totalValue;
    }
}
