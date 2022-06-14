import java.util.Scanner;

public class Interface {
    public void displayIntro() {
        System.out.println("You are in a land full of dragons. In front of you, you see two caves.\nIn one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry, and will eat you on sight.");
        System.out.println("You approach the cave...\n" +
                "It is dark and spooky..");

    }

    public int chooseCave() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Which cave will you go into? (1 or 2)");
        int choice = reader.nextInt();

        while(choice != 1 && choice != 2) {
            System.out.println("Only 1 or 2, please!");
            System.out.println();
            System.out.print("Which cave will you go into? (1 or 2)");
            choice = reader.nextInt();
        }

        System.out.println();
        return choice;

    }

    public void showResult(boolean isPlayerWin) {
        System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");

        if (isPlayerWin) {
            System.out.println("Hands you his treasure!\nLuck is on your side traveler!");
        } else {
            System.out.println("Gobbles you down in one bite!");
        }

        System.out.println();
    }

    public boolean isPlayAgain() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Dare to risk your life again? (y or n)");

        String choice = reader.nextLine();

        while(!choice.equalsIgnoreCase("y")  && !choice.equalsIgnoreCase("n")) {
            System.out.println("Only y or n, please!");
            System.out.println();
            System.out.print("Dare to risk your life again? (y or n)");
            choice = reader.nextLine();
        }

        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }

    }

    public void flushScreen() {
        for(int i=1; i<101; i++) {
            System.out.println("\n");
        }

    }

}