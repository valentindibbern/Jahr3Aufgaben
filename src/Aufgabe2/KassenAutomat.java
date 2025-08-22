package Aufgabe2;

public class KassenAutomat {

    private static int kassenAutomatCounter = 0;

    private final String id;

    public KassenAutomat() {
        this.id = String.valueOf(kassenAutomatCounter);
        kassenAutomatCounter++;
    }

    public void bezahlTicket(Ticket ticket) {
        ticket.bezahlen();
    }
}
