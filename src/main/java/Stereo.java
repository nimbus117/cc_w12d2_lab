public class Stereo {
    private Radio radio;
    private RecordPlayer recordPlayer;
    private CdPlayer cdPlayer;
    private String name;

    public Stereo(Radio radio, RecordPlayer recordPlayer, CdPlayer cdPlayer, String name)  {
        this.radio = radio;
        this.recordPlayer = recordPlayer;
        this.cdPlayer = cdPlayer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String changeVolume(int amount) {
       return String.format("volume changed by %s", amount);
    }

    public String tuneRadio() {
        return radio.tune();
    }

    public String play(Component component) {
        return component.play();
    }

    public String stop(Component component) {
        return component.stop();
    }
}
