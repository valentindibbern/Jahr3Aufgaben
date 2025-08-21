package Aufgabe2;

public class Ticket {

    private static int ticketCounter = 0;

    private final int ticketId;
    private final long einfahrtsZeit;
    private boolean bezahlt;

    public Ticket() {
        this.ticketId = ticketCounter;
        this.einfahrtsZeit = System.currentTimeMillis();
        this.bezahlt = false;

        ticketCounter++;
    }

    // Getter/Setter
    public int getTicketId() {return ticketId;}
    public long getEinfahrtsZeit() {return einfahrtsZeit;}
    public boolean isBezahlt() {return bezahlt;}
    public void toggleBezahlt() {this.bezahlt = !this.bezahlt;}
}
