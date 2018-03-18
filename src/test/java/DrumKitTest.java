import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumkit;

    @Before
    public void before(){
        drumkit = new DrumKit("Percussion","Ludwig", "Vistalite 5pc", 3400);
    }

    @Test
    public void getType(){
        assertEquals("Percussion", drumkit.getType());
    }

    @Test
    public void getMake(){
        assertEquals("Ludwig", drumkit.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Vistalite 5pc", drumkit.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(3400, drumkit.getPrice());
    }

    @Test
    public void canPlaySound(){
        assertEquals("This instrument goes boomboombangabang", drumkit.play("boomboombangabang"));
    }
}
