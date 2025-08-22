package Aufgabe2;

public class Ticket {

    private static int ticketCounter = 0;

    private final int ticketId;
    private final long einfahrtsZeit;
    private boolean bezahlt;
    private long bezahlsZeit;
    private long zeit;

    public Ticket() {
        this.ticketId = ticketCounter;
        this.einfahrtsZeit = System.nanoTime();
        this.bezahlt = false;

        ticketCounter++;
    }

    public long getEinfahrtsZeit() {return einfahrtsZeit;}
    public boolean isBezahlt() {return bezahlt;}
    public void bezahlen() {
        this.bezahlsZeit = System.nanoTime();
        this.zeit = this.bezahlsZeit - this.einfahrtsZeit;
        this.bezahlt = true;
    }
}
