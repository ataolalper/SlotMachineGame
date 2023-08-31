import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int random1, random2, random3, select;

        label:
        while (true) {
            System.out.println("\nWelcome to the Slot Game\n1 - New Game\n2 - Exit");
            System.out.print("Select: ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    break;
                case 2:
                    break label;
                default:
                    System.out.println("\nUndefined action.");
                    continue;
            }

            random1 = random.nextInt(1, 4);
            random2 = random.nextInt(1, 4);
            random3 = random.nextInt(1, 4);

            if (random1 == random2 && random2 == random3) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }
        }
    }
}