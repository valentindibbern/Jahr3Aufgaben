package Aufgabe2;

public class SchrankenAutomat {

    private static int schrankenAutomatCounter = 0;

    private final String id;
    private final String schrankenId;

    public SchrankenAutomat(String schrankenId) {
        this.id = String.valueOf(schrankenAutomatCounter);
        this.schrankenId = schrankenId;
        schrankenAutomatCounter++;
    }

    public Ticket giveTicket() {return new Ticket();}
    public boolean chekcTicket(Ticket ticket) {return ticket.isBezahlt();}
}
