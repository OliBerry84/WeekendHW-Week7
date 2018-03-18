package StockItemsTest;

import StockItems.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("GuitarStrings", 75, 100);
    }

    @Test
    public void getDescription(){
        assertEquals("GuitarStrings", guitarStrings.getDescription());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(75, guitarStrings.getBuyPrice());
    }

    @Test
    public void getSellPrice(){
        assertEquals(100, guitarStrings.getSellPrice());
    }
}
