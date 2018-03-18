import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("String","Gibson", "Les Paul", "Dark Red", 6, 2000);
    }

    @Test
    public void getType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void getMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(2000, guitar.getPrice());
    }

    @Test
    public void getColour(){
        assertEquals("Dark Red", guitar.getColour());
    }

    @Test
    public void getStrings(){
        assertEquals(6, guitar.getStrings());
    }

}
