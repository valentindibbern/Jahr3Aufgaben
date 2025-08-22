package Aufgabe2;

import java.util.Optional;

public class Fahrer {
    private final String name;
    private int guthaben;
    private final Auto auto;
    private Ticket ticket;

    public Fahrer(String name, int guthaben, Auto auto) {
        this.name = name;
        this.guthaben = guthaben;
        this.auto = auto;
    }

    public String getName() {return this.name;}
    public Auto getAuto() {return this.auto;}
    public Ticket getTicket() {return this.ticket;}
    public void bezahlt(int wehrt) {this.guthaben -= wehrt;}
    public void setTicket(Optional<Ticket> ticket) {
        if (ticket.isPresent()) {
            this.ticket = ticket.orElse(null);
        } else {
            System.out.printf("%s hat kein Ticket bekommen%n", this.name);
        }
    }
}
