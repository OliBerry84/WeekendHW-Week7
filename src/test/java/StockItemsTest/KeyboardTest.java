package StockItemsTest;

import StockItems.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Instrument", 120, 500);
    }

    @Test
    public void getDescription(){
        assertEquals("Instrument", keyboard.getDescription());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(75, keyboard.getBuyPrice());
    }

    @Test
    public void getSellPrice(){
        assertEquals(100, keyboard.getSellPrice());
    }

    @Test
    public void getMarkUp(){
        assertEquals(380, keyboard.calculateMarkUp(120,500));
    }

    @Test
    public void canPlaySound(){
        assertEquals("This instrument goes I'm a keyboard", keyboard.play("I'm a keyboard"));
    }
}
