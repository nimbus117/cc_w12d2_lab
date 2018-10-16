import com.sun.prism.shader.AlphaOne_RadialGradient_AlphaTest_Loader;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {
    RecordPlayer record;
    ArrayList<Integer> speeds;
    @Before
    public void before() {
        speeds = new ArrayList<>();
        speeds.add(33);
        speeds.add(44);
        speeds.add(78);
        record = new RecordPlayer(speeds, "Numark", "FX17");
    }

   @Test
   public void hasMake() {
        assertEquals("Numark", record.getMake());
   }

    @Test
    public void hasModel() {
        assertEquals("FX17", record.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing", record.play());
    }

    @Test
    public void canStop() {
        assertEquals("Stopping", record.stop());
    }

    @Test
    public void canGetPlaySpeeds() {
        assertEquals(speeds, record.getPlaySpeeds());
    }
}
