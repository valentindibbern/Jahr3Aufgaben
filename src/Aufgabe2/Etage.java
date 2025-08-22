package Aufgabe2;

import java.util.Arrays;
import java.util.Optional;

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

    public boolean isVoll() {return getAnzahlOffeneParkplätze() == 0;}
    public int getAnzahlOffeneParkplätze() {
        return Math.toIntExact(Arrays.stream(this.parkplätze).filter(Parkplatz::isFrei).count());
    }
    public Optional<Parkplatz> getNächstenFreienParkplatz() {
        for (Parkplatz parkplatz : this.parkplätze) {
            if (parkplatz.isFrei()) {
                return Optional.of(parkplatz);
            }
        }
        return Optional.empty();
    }
    public Optional<Parkplatz> getNächstenBesetztenParkplatz() {
        for (Parkplatz parkplatz : this.parkplätze) {
            if (!parkplatz.isFrei()) {
                return Optional.of(parkplatz);
            }
        }
        return Optional.empty();
    }
}
