package Aufgabe2;

import java.util.Arrays;
import java.util.Optional;

public class Parkhaus {
    private final String id;
    private final int anzahlParkplätzeProEtage;
    private final int anzahlParkplätze;
    private final int anzahlEtagen;
    private final Etage[] etagen;
    public final Schranke einfahrtsschranke;
    public final Schranke ausfahrtsschranke;

    public Parkhaus(String id, int anzahlParkplätzeProEtage, int anzahlEtagen) {
        this.id = id;
        this.anzahlParkplätzeProEtage = anzahlParkplätzeProEtage;
        this.anzahlEtagen = anzahlEtagen;
        this.etagen = new Etage[this.anzahlEtagen];
        this.anzahlParkplätze = this.anzahlParkplätzeProEtage * this.anzahlEtagen;
        this.einfahrtsschranke = new Schranke(this);
        this.ausfahrtsschranke = new Schranke(this);

        for (int i = 0; i < this.anzahlEtagen; i++) {
            this.etagen[i] = new Etage(this.id + i, this.id, this.anzahlParkplätzeProEtage);
        }
    }

    public void checkDisplay() {
        System.out.println("Gesammte offene Parkplätze: " + this.getAnzahlOffeneParkplätze());
    }
    public int getAnzahlOffeneParkplätze() {
        return Arrays.stream(this.etagen).mapToInt(Etage::getAnzahlOffeneParkplätze).sum();
    }
    public Schranke getEinfahrtsschranke() {return this.einfahrtsschranke;}
    public Schranke getAusfahrtsschranke() {return this.ausfahrtsschranke;}
    public Parkplatz getNächstenFreienParkplatz() {
        for (Etage etage : this.etagen) {
            Optional<Parkplatz> parkplatz = etage.getNächstenFreienParkplatz();
            if (parkplatz.isPresent()) {
                return parkplatz.orElse(null);
            }
        }
        throw new RuntimeException("Sucht nach Parkplätzen obwohl keine mehr frei sind.");
    }
    public Parkplatz getNächstenBesetztenParkplatz() {
        for (Etage etage : this.etagen) {
            Optional<Parkplatz> parkplatz = etage.getNächstenBesetztenParkplatz();
            if (parkplatz.isPresent()) {
                return parkplatz.orElse(null);
            }
        }
        throw new RuntimeException("Sucht nach Parkplätzen obwohl keine mehr frei sind.");
    }
}
