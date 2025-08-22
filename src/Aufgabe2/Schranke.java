package Aufgabe2;

import java.util.Optional;

public class Schranke {

    private static int schrankenCounter = 0;

    private final String id;
    private final Parkhaus parkhaus;
    private final SchrankenAutomat schrankenAutomat;

    public Schranke(Parkhaus Parkhaus) {
        this.id = String.valueOf(schrankenCounter);
        this.parkhaus = Parkhaus;
        this.schrankenAutomat = new SchrankenAutomat(this.id);

        schrankenCounter++;
    }

    public Optional<Ticket> einfahren(Auto auto) {
        if (this.parkhaus.getAnzahlOffeneParkplätze() != 0) {
            auto.toggleInParkhaus();
            this.parkhaus.getNächstenFreienParkplatz().toggelBesetzt();
            return Optional.ofNullable(this.schrankenAutomat.giveTicket());
        } else {
            System.out.println("Parkhaus voll.");
            return Optional.empty();
        }
    }

    public void ausfahren(Fahrer fahrer) {
        if (fahrer.getTicket().isBezahlt()) {
            fahrer.getAuto().toggleInParkhaus();
            this.parkhaus.getNächstenBesetztenParkplatz().toggelBesetzt();
        } else {
            System.out.println("Ticket noch nicht bezahlt.");
        }
    }
}
