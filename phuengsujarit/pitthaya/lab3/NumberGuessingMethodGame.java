package phuengsujarit.pitthaya.lab3;

import java.util.*;

public class NumberGuessingMethodGame {
   static int answer; // define variable
   final static int MIN = 1;
   final static int MAX = 20;

   public static void main(String[] args) { // define main function that will lunch genAnswer and playgame function.
      genAnswer();
      playgame();
   }

   public static void genAnswer() {
      answer = MIN + (int) (Math.random() * ((MAX - MIN) + 1)); // define variable to get random answer between Min and Max.
                                                                
   }

   public static void playgame() { // define playgame function.
      Math.random();
      System.out.println("Welcome to a number guessing game!");
      Scanner scanner = new Scanner(System.in); // use scanner
      int numTries = 1;
      while (numTries < 6) {
         System.out.print("Enter an integer between 1 and 20:");
         int guessing = scanner.nextInt(); // define variable to get integer input.

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

               {
                  if (numTries == 5) { // chec if game over.
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  } else {

                     System.out.println("Try a lower number!");

                  }
               }

               numTries = numTries + 1;

            }

         } else if (guessing < answer) { // check if player's answer lower than real answer.
            {

               {
                  if (numTries == 5) { // check if game over.
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  } else {
                     System.out.println("Try a higher number!");

                  }
               }

               numTries = numTries + 1;
            }
         }
      }
      scanner.close();// close scanner.
   }

}
