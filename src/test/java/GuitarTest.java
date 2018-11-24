import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("cedar wood", "Mahogany", "String", "Newly released Martin", 200, 400);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("cedar wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Mahogany", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Newly released Martin", guitar.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(200, guitar.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(400, guitar.getSellingPrice());
    }

    @Test
    public void canGetSound() {
        assertEquals("vraaaaam", guitar.playTune("vraaaaam"));
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200, guitar.calculateMarkup(), 0);
    }
}
