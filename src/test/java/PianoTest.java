import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Percussion", "Steinway", "Model B", "Black", 88, 45000);
    }

    @Test

    public void getType(){
        assertEquals("Percussion", piano.getType());
    }

  public void getMake(){
        assertEquals("Steinway", piano.getMake());
  }

    @Test
    public void getModel(){
        assertEquals("Model B", piano.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(45000, piano.getPrice());
    }

    @Test
    public void getColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void getKeys(){
        assertEquals(88, piano.getKeys());
    }

}
