package test;

import java.util.Scanner;

import static java.lang.System.out;

public class GTNG {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Hello! What is your name?");
    Scanner input = new Scanner(System.in);
    String name = input.next();
    System.out.println("Well," + name +  " I am thinking of a number between 1 and 20.");

    char replay = 'y';
    int K = 6;
    int i, guess;
    while(replay=='y'){
        int number = 1 + (int)(20* Math.random());
        for (i = 1; i <= K; i++) {
            out.println("Take a guess.");

            guess = sc.nextInt();

            if (number == guess) {
                out.println("Good job," + name + "! You guessed my number in " + i +" guesses!");
                break;
            }
            else if (number > guess && i != K) {
                out.println("Your guess is too low.");
            }
            else if (number < guess && i != K) {
                out.println("Your guess is too high.");
            }
        }

        if (i == K+1) {
            out.println("You dont have any more guesses left.");
            out.println("The number was " + number);
        }
        out.println("Would you like to play again? (y or n)");
        replay = sc.next().charAt(0);
    }
}
}

