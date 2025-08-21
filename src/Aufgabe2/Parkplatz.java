package Aufgabe2;

public class Parkplatz {
    private final String id;
    private final String etagenId;
    private final String parkhausId;
    private boolean besetzt;

    public Parkplatz(String id, String etageId, String parkhausId) {
        this.id = id;
        this.etagenId = etageId;
        this.parkhausId = parkhausId;
        this.besetzt = false;
    }

    public String getId() {return this.id;}
    public String getEtagenId() {return this.etagenId;}
    public String getParkhausId() {return this.parkhausId;}
    public boolean isFrei() {return !this.besetzt;}
    public void toggelBesetzt() {this.besetzt = !this.besetzt;}
}
