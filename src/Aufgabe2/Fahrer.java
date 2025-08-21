package Aufgabe2;

public class Fahrer {
    private final String name;
    private final Auto auto;
    private Ticket ticket;

    public Fahrer(String name, Auto auto) {
        this.name = name;
        this.auto = auto;
    }

    public String getName() {
        return this.name;
    }
    public Auto getAuto() {
        return this.auto;
    }
    public Ticket getTicket() {
        return this.ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
