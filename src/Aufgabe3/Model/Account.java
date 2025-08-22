package Aufgabe3.Model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Objects;
import java.util.OptionalDouble;

public class Account {
    private int accountZähler = 0;

    private final int id;
    private final String vorname;
    private final String nachname;
    private final LocalDate geburtsDatum;
    private String password;
    private Double kontostand;
    private ArrayList<Transaction> transactionHistory;

    public Account(String vorname, String nachname, LocalDate geburtsDatum, String password) {
        this.id = accountZähler;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.password = password;
        this.kontostand = 0.0;

        accountZähler++;
    }

    public int getId() {return this.id;}
    public String getVorname() {return this.vorname;}
    public String getNachname() {return this.nachname;}
    public LocalDate getGeburtsDatum() {return this.geburtsDatum;}
    public boolean isPassword(String password) {return Objects.equals(this.password, password);}
    public OptionalDouble getKontostand(String password) {
        return this.isPassword(password) ? OptionalDouble.of(this.kontostand) : OptionalDouble.empty();
    }
    public boolean changePassword(String password, String newPassword) {
        if (this.isPassword(password)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
    public void changeKontostand(Double menge) {this.kontostand += menge;}
    public void addTransaction(Transaction transaction) {this.transactionHistory.add(transaction);}
    public ArrayList<Transaction> getTransactionByTransactionId(int id) {
        ArrayList<Transaction> transactionSammlung = new ArrayList<>();
        for (Transaction transaction : this.transactionHistory) {
            if (transaction.getId() == id) {
                transactionSammlung.add(transaction);
            }
        }

        return transactionSammlung;
    }
    public ArrayList<Transaction> getTransactionByAccountId(int id) {
        ArrayList<Transaction> transactionSammlung = new ArrayList<>();
        for (Transaction transaction : this.transactionHistory) {
            if (transaction.getEmfpänger().getId() == id || transaction.getSender().getId() == id) {
                transactionSammlung.add(transaction);
            }
        }

        return transactionSammlung;
    }
    public ArrayList<Transaction> getTransactionByBetrag(double betrag) {
        ArrayList<Transaction> transactionSammlung = new ArrayList<>();
        for (Transaction transaction : this.transactionHistory) {
            if (transaction.getBetrag().equals(betrag)) {
                transactionSammlung.add(transaction);
            }
        }
        return transactionSammlung;
    }
    public ArrayList<Transaction> getTransactionByDate(LocalDate date) {
        ArrayList<Transaction> transactionSammlung = new ArrayList<>();
        for (Transaction transaction : this.transactionHistory) {
            LocalDate instantDate = transaction.getMoment().atZone(ZoneId.systemDefault()).toLocalDate();
            if (date.isEqual(instantDate)) {
                transactionSammlung.add(transaction);
            }
        }

        return transactionSammlung;
    }
}
