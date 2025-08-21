package Aufgabe2;

public class Auto {
    private final Fahrer fahrer;

    public Auto(Fahrer fahrer) {
        this.fahrer = fahrer;
    }

    public Fahrer getFahrer() {
        return this.fahrer;
    }
}
