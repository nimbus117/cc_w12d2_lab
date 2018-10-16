import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    @Test
    public void canTune() {
        Radio radio = new Radio();
        assertEquals("Radio1", radio.tune());
    }
}
