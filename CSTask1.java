// CodeSoft Task1 Number Game
import java.util.Random;
import java.util.Scanner;
public class CSTask1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nWelcome to Number Game ! ");
        Random random = new Random();
        //I am using random method or class  for random number should generate automatically
        int score = 0;
        int rounds = 0;

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(40) + 1; 
            int attempts = 10;
            rounds++;
            System.out.println("\nRound " + rounds + ": Guess a number between 1 and 40");
            System.out.println("You have " + attempts + " attempts");

        while (attempts > 0) {
                System.out.print("Enter your number: ");
                try {
                    int guess = sc.nextInt();

          if (guess < numberToGuess) {
                  System.out.println("Your number is too low!");
             } else if (guess > numberToGuess) {
                  System.out.println("Your number is too high!");
              } else {
       System.out.println("Congratulations! You guessed the number in " + (10 - attempts + 1) + " attempts");
              score++;
             break;
         }

          attempts--;
          System.out.println(" Remaining attempts: " + attempts);

         if (attempts == 0) {
             System.out.println("Oops..Game is over! The number was " + numberToGuess);
                 }
         } catch (Exception e) {
                System.out.println("Number is Wrong/Invalid input. Please enter a number.");
                sc.next();
                }
            }

            System.out.print("\nYou Want to Play again? (y/n): ");
            String input = sc.next();
            playAgain = input.equalsIgnoreCase("y");
        }

     System.out.println("\nGame is over..! Your final score is " + score + " out of " + rounds + " rounds");
    }
}