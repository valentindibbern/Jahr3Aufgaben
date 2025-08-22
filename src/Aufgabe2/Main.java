package Aufgabe2;

public class Main {
    static Parkhaus parkhaus = new Parkhaus("1", 1, 2);

    public static Auto auto1 = new Auto("1");
    public static Fahrer fahrer1 = new Fahrer("Arthur",auto1);
    public static Auto auto2 = new Auto("2");
    public static Fahrer fahrer2 = new Fahrer("Bastin", auto2);
    public static Auto auto3 = new Auto("3");
    public static Fahrer fahrer3 = new Fahrer("Cyrus", auto3);

    public static void main(String[] args) {
        parkhaus.checkDisplay();
        fahrer1.setTicket(parkhaus.getEinfahrtsschranke().einfahren(auto1));
        System.out.printf("Is in Parkhaus: %b.%n", fahrer1.getAuto().inParkhaus());
        fahrer2.setTicket(parkhaus.getEinfahrtsschranke().einfahren(auto2));
        parkhaus.checkDisplay();
    }
}
