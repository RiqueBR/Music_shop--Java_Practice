import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import Shops.MusicShop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    ArrayList<ISell> stock;
    Guitar guitar;
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Maple wood", "Dark Brown", "Keys", "Old School baby grand piano", 300, 500);
        guitar = new Guitar("cedar wood", "Mahogany", "String", "Newly released Martin", 200, 400);
        musicShop = new MusicShop();
        stock = new ArrayList<ISell>();
    }

    @Test
    public void canAddItems() {
        musicShop.addItem(guitar);
        musicShop.addItem(piano);
        assertEquals(2, musicShop.checkStock());
    }

    @Test
    public void canRemoveItems() {
        musicShop.addItem(guitar);
        musicShop.addItem(piano);
        musicShop.removeItem(guitar);
        assertEquals(1, musicShop.checkStock());
    }

    @Test
    public void canGetTotalProfit() {
        musicShop.addItem(guitar);
        musicShop.addItem(piano);
        assertEquals(400, musicShop.calculateMarkup(), 0);
    }
}
