package Aufgabe2;

public class Auto {
    private final int id;
    private Fahrer fahrer;
    private String parkplatzId;

    public Auto(int id) {this.id = id;}

    public int getId() {return this.id;}
    public Fahrer getFahrer() {return this.fahrer;}
    public String setParkplatzId() {return this.parkplatzId;}
    public void setFahrer(Fahrer fahrer) {this.fahrer = fahrer;}
    public void setParkplatzId(String parkplatzId) {this.parkplatzId = parkplatzId;}
}
