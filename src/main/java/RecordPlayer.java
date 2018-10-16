import java.util.ArrayList;

public class RecordPlayer extends Component {
    ArrayList<Integer> playSpeeds;


    public RecordPlayer(ArrayList<Integer> playSpeeds, String make, String model) {
        super(make, model);
        this.playSpeeds = playSpeeds;
    }

    public ArrayList getPlaySpeeds() {
        return playSpeeds;
    }
}
