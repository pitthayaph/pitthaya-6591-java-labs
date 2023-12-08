package phuengsujarit.pitthaya.lab3;

import java.util.*;

public class NumberGuessingGames {
   static int answer, min, max, numTries, maxTries; // define variable.
   static Scanner input = new Scanner(System.in); // define variable to get input.

   public static void main(String[] args) { // define main function that will lunch configure ,genAnswer and playgame
                                            // function.
      configure();
      genAnswer();
      playgame();

   }

   public static void configure() { // define configure function to ask player for max value ,min value and maximum
                                    // number of tries.
      System.out.print("Enter the min value:");
      min = input.nextInt();
      do { // check if max < min and ask player for a new max value.
         System.out.print("Enter the max value:");
         max = input.nextInt();
         if (max < min) {
            System.out.println("The max value must be at least equal to the min value");
         }
      } while (max < min);

      do { // check if maximum number of tries <= 0 and ask player for a new maximum number
           // of tries
         System.out.print("Enter the maximum number of tries:");
         maxTries = input.nextInt();
         if (maxTries <= 0) {
            System.out.println("The maximum number of tries must be greater than 0");
         }
      } while (maxTries <= 0);
      {

      }

   }

   public static void genAnswer() { // define genAnswer function to random answer.
      answer = min + (int) (Math.random() * ((max - min) + 1));
   }

   public static void playgame() { // define playgame function.
      Math.random();
      int guessing;
      System.out.println("Welcome to a number guessing game!");

      int numTries = 1;
      while (numTries < maxTries + 1) { // the game will lunch while numTries < maxTries .
         do {
            System.out.print("Enter an integer between " + min + "and" + max + ":");
            guessing = input.nextInt();
            if (guessing < min || guessing > max) // check if input min > max
               System.out.println("The number must me between" + min + "and" + max);
         } while (guessing < min || guessing > max);

         if (guessing == answer) { // check if player's answer is correct.
            System.out.println("Congratulations!");
            {
               if (numTries == 1) {
                  System.out.println("You have tried " + numTries + " time");
               } else if (numTries != 1) {
                  System.out.println("You have tried " + numTries + " times");
               }

               break;

            }
         } else if (guessing > answer) { // check if player's answer higher than real answer.
            {
               System.out.println("Try a lower number!");

               {
                  if (numTries == maxTries) { // check if game over.
                     System.out.println("You have tried " + numTries + " times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  }
               }

               numTries = numTries + 1;

            }

         } else if (guessing < answer) { // check if player's answer lower than real answer.
            {
               System.out.println("Try a higher number!");

               {
                  if (numTries == maxTries) { // check if game over.
                     System.out.println("You have tried " + numTries + " times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  }
               }

               numTries = numTries + 1;
            }
         }
      }
      System.out.print("Want to play again (Y or y):"); // ask player for play again
      String playagaint = input.next();
      playagaint = playagaint.toUpperCase(); // change y to Y
      if (playagaint.equals("Y")) { // check if playagaint variable is Y lunch playgame function againt.
         playgame();
      } else {
         System.out.println("Thank you for playing our games. Bye!");
      }
      input.close(); // close scanner
      input.close(); // close scanner
   }

}
