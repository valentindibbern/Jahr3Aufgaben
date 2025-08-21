package Aufgabe2;

public class Ticket {
    private final int ticketId;
    private final long einfahrtsZeit;
    private boolean bezahlt;

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
        this.einfahrtsZeit = System.currentTimeMillis(); // Zeit beim Erstellen
        this.bezahlt = false; // Standard: nicht bezahlt
    }

    // Getter/Setter
    public int getTicketId() {
        return ticketId;
    }

    public long getEinfahrtsZeit() {
        return einfahrtsZeit;
    }

    public boolean isBezahlt() {
        return bezahlt;
    }

    public void setBezahlt(boolean bezahlt) {
        this.bezahlt = bezahlt;
    }
}
