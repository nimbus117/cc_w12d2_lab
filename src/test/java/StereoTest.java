import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;
    CdPlayer cdPlayer;
    RecordPlayer recordPlayer;
    Radio radio;
    @Before
    public void before() {
        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(33);
        speeds.add(44);
        speeds.add(78);
        recordPlayer = new RecordPlayer(speeds, "Numark", "FX17");
        cdPlayer = new CdPlayer(3, "Sony", "BH29");
        radio = new Radio();
        stereo = new Stereo(radio, recordPlayer, cdPlayer, "MyStereo");
    }

    @Test
    public void canGetName() {
        assertEquals("MyStereo", stereo.getName());
    }

    @Test
    public void canChangeVolume() {
        assertEquals("volume changed by -2", stereo.changeVolume(-2));
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Radio1", stereo.tuneRadio());
    }

    @Test
    public void canPlaycd() {
        assertEquals("Playing", stereo.play(cdPlayer));
    }

    @Test
    public void canStopRecordPlayer() {
        assertEquals("Stopping", stereo.stop(recordPlayer));
    }
}
