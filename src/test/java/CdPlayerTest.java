import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {
    CdPlayer cdPlayer;
    @Before
    public void before() {
        cdPlayer = new CdPlayer(3, "Sony", "BH29");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("BH29", cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing", cdPlayer.play());
    }

    @Test
    public void canStop() {
        assertEquals("Stopping", cdPlayer.stop());
    }

    @Test
    public void canGetPlaySpeeds() {
        assertEquals(3, cdPlayer.getNumberOfCds());
    }
}
