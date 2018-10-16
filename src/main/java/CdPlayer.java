public class CdPlayer extends Component{
    private int numberOfCds;

    public CdPlayer(int numberOfCds, String make, String model) {
        super(make, model);
       this.numberOfCds = numberOfCds;
    }
    public int getNumberOfCds() {
        return numberOfCds;
    }
}
