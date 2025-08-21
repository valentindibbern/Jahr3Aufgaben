package Aufgabe2;

import java.util.Arrays;

public class Parkhaus {
    public class Parkplatz {
        private final int id;
        private boolean besetzt;
        private final int etagenId;
        private final int parkhausId;

        public Parkplatz(int id, int etageId, int parkhausId) {
            this.id = id;
            this.besetzt = false;
            this.etagenId = etageId;
            this.parkhausId = parkhausId;
        }

        public int getId() {
            return this.id;
        }

        public int getEtagenId() {
            return this.etagenId;
        }

        public int getParkhausId() {
            return this.parkhausId;
        }

        public boolean isFrei() {
            return this.besetzt;
        }

        public void toggelBesetzt() {
            this.besetzt = !this.besetzt;
        }
    }

    public class Etage {
        private final int id;
        private final int parkhausId;
        private final Parkplatz[] parkplätze;
        private final KassenAutomat kassenAutomat;

        public Etage(int id, int parkhausId, int anzahlParkplätze, KassenAutomat kassenAutomat) {
            this.id = id;
            this.parkhausId = parkhausId;
            this.kassenAutomat = kassenAutomat;
            this.parkplätze = new Parkplatz[anzahlParkplätze];

            for (int i = 0; i < anzahlParkplätze; i++) {
                this.parkplätze[i] = new Parkplatz(this.id + i, this.id, this.parkhausId);
            }
        }

        public int getId() {
            return this.id;
        }

        public int getParkhausId() {
            return this.parkhausId;
        }

        public int getAnzahlParkplätze() {
            return this.parkplätze.length;
        }

        public int getOffeneParkplätze() {
            return Math.toIntExact(Arrays.stream(this.parkplätze).filter(Parkplatz::isFrei).count());
        }
    }

    private final int anzahlParkplätze;
    private final int anzahlEtagen;

    public Parkhaus(int anzahlParkplätze, int anzahlEtagen) {
        this.anzahlParkplätze = anzahlParkplätze;
        this.anzahlEtagen = anzahlEtagen;
    }

    public int getEtagen() {
        return this.anzahlEtagen;
    }

    public int getAnzahlParkplätze() {
        return anzahlParkplätze;
    }
}
