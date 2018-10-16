public class CdPlayer {
    private int numberOfCds;
    private String make;
    private String model;

    public CdPlayer(int numberOfCds, String make, String model) {
       this.numberOfCds = numberOfCds;
       this.make = make;
       this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfCds() {
        return numberOfCds;
    }

    public String play() {
        return "Playing";
    }

    public String stop() {
        return "Stopping";
    }
}
