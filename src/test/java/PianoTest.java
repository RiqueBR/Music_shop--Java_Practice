import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Maple wood", "Dark Brown", "Keys", "Old School baby grand piano", 300, 500);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Maple wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Dark Brown", piano.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Keys", piano.getType());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Old School baby grand piano", piano.getDescription());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(300, piano.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(500, piano.getSellingPrice());
    }

    @Test
    public void canGetSound() {
        assertEquals("blih blah", piano.playTune("blih blah"));
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200, piano.calculateMarkup(), 0);
    }
}
