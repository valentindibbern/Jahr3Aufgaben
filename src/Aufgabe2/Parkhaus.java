package Aufgabe2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Parkhaus {
    private final String id;
    private final int anzahlParkplätzeProEtage;
    private final int anzahlParkplätze;
    private final int anzahlEtagen;
    private final Etage[] etagen;

    public Parkhaus(String id, int anzahlParkplätzeProEtage, int anzahlEtagen) {
        this.id = id;
        this.anzahlParkplätzeProEtage = anzahlParkplätzeProEtage;
        this.anzahlEtagen = anzahlEtagen;
        this.etagen = new Etage[this.anzahlEtagen];
        this.anzahlParkplätze = this.anzahlParkplätzeProEtage * this.anzahlEtagen;

        for (int i = 0; i < this.anzahlEtagen; i++) {
            this.etagen[i] = new Etage(this.id + i, this.id, this.anzahlParkplätzeProEtage);
        }
    }

    public int getEtagen() {return this.anzahlEtagen;}
    public int getAnzahlParkplätze() {return this.anzahlParkplätze;}
    public int getAnzahlParkplätzeProEtage() {return anzahlParkplätzeProEtage;}
    public int getAnzahlOffeneParkplätze() {
        return Arrays.stream(this.etagen).mapToInt(Etage::getAnzahlOffeneParkplätze).sum();
    }

    public void checkDisplay() {
        System.out.println("Gesammte offene Parkplätze: " + this.getAnzahlOffeneParkplätze());
    }
}
