package Aufgabe2;

import java.util.Arrays;

public class Etage {
    private final String id;
    private final String parkhausId;
    private final int anzahlParkplätze;
    private final Parkplatz[] parkplätze;
    private final KassenAutomat kassenAutomat;

    public Etage(String id, String parkhausId, int anzahlParkplätze) {
        this.id = id;
        this.parkhausId = parkhausId;
        this.anzahlParkplätze = anzahlParkplätze;
        this.parkplätze = new Parkplatz[this.anzahlParkplätze];
        this.kassenAutomat = new KassenAutomat();

        for (int i = 0; i < this.anzahlParkplätze; i++) {
            this.parkplätze[i] = new Parkplatz(this.id + i, this.id, this.parkhausId);
        }
    }

    public String getId() {return this.id;}
    public String getParkhausId() {return this.parkhausId;}
    public int getAnzahlParkplätze() {return this.anzahlParkplätze;}
    public int getAnzahlOffeneParkplätze() {
        return Math.toIntExact(Arrays.stream(this.parkplätze).filter(Parkplatz::isFrei).count());
    }
}
