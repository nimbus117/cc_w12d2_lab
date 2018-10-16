import java.util.ArrayList;

public class RecordPlayer {
    ArrayList<Integer> playSpeeds;
    private String make;
    private String model;


    public RecordPlayer(ArrayList<Integer> playSpeeds, String make, String model) {
        this.playSpeeds = playSpeeds;
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public ArrayList getPlaySpeeds() {
        return playSpeeds;
    }

    public String play() {
        return "Playing";
    }

    public String stop() {
        return "Stopping";
    }
}
