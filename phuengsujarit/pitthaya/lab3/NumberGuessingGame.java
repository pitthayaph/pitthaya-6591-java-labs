package phuengsujarit.pitthaya.lab3;

import java.util.*; //impot for scanner

public class NumberGuessingGame {
   public static void main(String[] args) {
      Math.random();
      System.out.println("Welcome to a number guessing game!");
      int random = 1 + (int) (Math.random() * ((20 - 1) + 1)); // random answer
      Scanner scanner = new Scanner(System.in);
      int numTries = 1; // define variable to get time that player answer
      while (numTries < 6) {
         System.out.print("Enter an integer between 1 and 20:");
         int guessing = scanner.nextInt(); // define variable to get integer input.
         if (guessing == random) { // check if player's answer is correct.
            System.out.println("Congratulations!");
            {
               if (numTries == 1) {
                  System.out.println("You have tried " + numTries + " time");
               } else if (numTries != 1) {
                  System.out.println("You have tried " + numTries + " times");
               }

               break;

            }
         } else if (guessing > random) { // check if player's answer is higher than real answer.
            {
               System.out.println("Try a lower number!");

               {
                  if (numTries == 5) { // check if game over.
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + random);
                     break;
                  }
               }

               numTries = numTries + 1;

            }

         } else if (guessing < random) { // check if player's answer is lower than real answer.
            {
               System.out.println("Try a higher number!");

               {
                  if (numTries == 5) {
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + random);
                     break;
                  }
               }

               numTries = numTries + 1;

            }

         }

      }
      scanner.close(); // close Scanner
   }
}
