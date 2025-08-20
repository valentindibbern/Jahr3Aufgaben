import java.util.Objects;
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

        while (running) {
            System.out.print("Was wollen sie machen?(ggt/kgv): ");
            String method = sc.nextLine();

            if (Objects.equals(method, "ggt")) {
                System.out.print("Gib die erste Zahl ein: ");
                int zahl1 = sc.nextInt();
                System.out.print("Gib die zweite Zahl ein: ");
                int zahl2 = sc.nextInt();
                System.out.print(ggt(zahl1, zahl2));

            } else if (Objects.equals(method, "kgv")) {
                System.out.print("Gib die erste Zahl ein: ");
                int zahl1 = sc.nextInt();
                System.out.print("Gib die zweite Zahl ein: ");
                int zahl2 = sc.nextInt();
                System.out.print(kgv(zahl1, zahl2));

            } else {
                System.out.print("Das war keine ganze Zahl. Bitte versuche es erneut.");
                continue;
            }

            System.out.println("Willst du weiter machen?(y/n): ");
            char decision = sc.next().charAt(0);
            running = (decision == 'y');
        }
    }
}