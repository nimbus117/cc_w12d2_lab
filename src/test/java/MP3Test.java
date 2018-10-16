import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3 mp3;
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
        mp3 = new MP3();
    }
    @Test
    public void canConnect() {
        assertEquals("MyStereo", mp3.connect(stereo));
    }
}
