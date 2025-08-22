package Aufgabe2;

public class Auto {
    private final String id;
    private String parkplatzId;
    private Boolean inParkhaus;

    public Auto(String id) {
        this.id = id;
        this.inParkhaus = false;
    }

    public String getId() {return this.id;}
    public String setParkplatzId() {return this.parkplatzId;}
    public boolean inParkhaus() {return this.inParkhaus;}
    public void setParkplatzId(String parkplatzId) {this.parkplatzId = parkplatzId;}
    public void toggleInParkhaus() {this.inParkhaus = !this.inParkhaus;}
}
