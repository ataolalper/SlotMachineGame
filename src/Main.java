import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int random1, random2, random3, select;
        int banana, cherry;

        label:
        while (true) {
            System.out.println("\nWelcome to the Slot Game\n1 - New Game\n0 - Exit");
            System.out.print("Select: ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    break;
                case 0:
                    break label;
                default:
                    System.out.println("\nUndefined action.");
                    continue;
            }

            random1 = random.nextInt(1, 4);
            random2 = random.nextInt(1, 4);
            random3 = random.nextInt(1, 4);

            banana = 1;
            cherry = 2;

            System.out.println(" ");

            if (random1 == banana){
                System.out.println("Banana");
            } else if (random1 == cherry){
                System.out.println("Cherry");
            } else {
                System.out.println("Apple");
            }

            if (random2 == banana){
                System.out.println("Banana");
            } else if (random2 == cherry){
                System.out.println("Cherry");
            } else {
                System.out.println("Apple");
            }

            if (random3 == banana){
                System.out.println("Banana");
            } else if (random3 == cherry){
                System.out.println("Cherry");
            } else {
                System.out.println("Apple");
            }

            if (random1 == random2 && random2 == random3) {
                System.out.println("\nYou win");
            } else {
                System.out.println("\nYou lose");
            }
        }
    }
}