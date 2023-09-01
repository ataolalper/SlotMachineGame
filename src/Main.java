import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Variables variables = new Variables();
        Work work = new Work();

        label:
        while (true) {
            System.out.println("\nWelcome to the Slot Game\n1 - New Game\n0 - Exit");
            System.out.print("Select: ");
            variables.select = scanner.nextInt();
            switch (variables.select) {
                case 1:
                    break;
                case 0:
                    break label;
                default:
                    System.out.println("\nUndefined action.");
                    continue;
            }
            variables.random1 = random.nextInt(1, 7);
            variables.random2 = random.nextInt(1, 7);
            variables.random3 = random.nextInt(1, 7);
            variables.random4 = random.nextInt(1, 7);
            variables.random5 = random.nextInt(1, 7);
            variables.random6 = random.nextInt(1, 7);
            work.add(variables);
        }
    }
}