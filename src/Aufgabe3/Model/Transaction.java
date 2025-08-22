package Aufgabe3.Model;

import java.time.Instant;

public class Transaction {
    private int transactionZähler = 0;

    private final int id;
    private final Account sender;
    private final Account emfpänger;
    private final Double betrag;
    private final Instant moment;

    public Transaction(Account sender, Account empfänger, Double betrag, Instant moment) {
        this.id = transactionZähler;
        this.sender = sender;
        this.emfpänger = empfänger;
        this.betrag = betrag;
        this.moment = moment;

        transactionZähler++;
    }

    public int getId() {return this.id;}
    public Account getEmfpänger() {return this.emfpänger;}
    public Account getSender() {return this.sender;}
    public Double getBetrag() {return this.betrag;}
    public Instant getMoment() {return this.moment;}

}
