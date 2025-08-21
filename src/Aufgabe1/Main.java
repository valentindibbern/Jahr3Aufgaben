package Aufgabe1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int ggt(int a, int b) {
        return (a % b == 0) ? b : ggt(b, a % b);
    }

    public static int kgv(int a, int b) {
        return a * b / ggt(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int zahl1, zahl2;

        while (running) {
            try {
                System.out.print("Gib die erste Zahl ein: ");
                zahl1 = sc.nextInt();
                System.out.print("Gib die zweite Zahl ein: ");
                zahl2 = sc.nextInt();

                System.out.println(ggt(zahl1, zahl2));
                System.out.println(kgv(zahl1, zahl2));

            } catch (InputMismatchException e) {
                System.out.println("Das war nicht der richtige Inputtype. Bitte versuche es erneut.");
            }

            System.out.print("Weiter?(y/n): ");
            char decision = sc.next().charAt(0);
            sc.nextLine();
            running = (decision == 'y');
        }
    }
}
