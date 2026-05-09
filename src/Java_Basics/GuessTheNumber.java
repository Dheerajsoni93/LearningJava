package Java_Basics;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number game");

        int players, minAttempt = Integer.MAX_VALUE;
        int winner = -1;
        System.out.print("Select the number of players: ");
        players = scanner.nextInt();

        for(int player = 1; player <= players; ++player){
            System.out.println("Player "+ player + " Guess a number between 1 to 1000");

            int randomNumber = random.nextInt(1, 1000);
            int myNumber;
            int attempts = 0;

            do{
                System.out.print("Enter the number: ");
                myNumber = scanner.nextInt();
                attempts++;

                if(myNumber < randomNumber){
                    System.out.println("Try a bigger number.");
                } else if(myNumber > randomNumber){
                    System.out.println("Try a lower number.");
                }
            } while(myNumber != randomNumber);

            System.out.println("Player " + player + " guessed the correct number in " + attempts + " attempts");

            if(attempts < minAttempt){
                winner = player;
                minAttempt = attempts;
            }
        }

        System.out.print("Player " + winner + " Winner");
        scanner.close();
    }
}
