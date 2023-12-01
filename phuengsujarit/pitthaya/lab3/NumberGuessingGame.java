package phuengsujarit.pitthaya.lab3;

import java.util.*;

public class NumberGuessingGame {
   public static void main(String[] args) {
      Math.random();
      System.out.println("Welcome to a number guessing game!");
      int random = 1 + (int) (Math.random() * ((20 - 1) + 1));
      Scanner scanner = new Scanner(System.in);
      int guess = 1;
      while (guess < 6) {
         System.out.print("Enter an integer between 1 and 20:");
         int guessing = scanner.nextInt();
         if (guessing == random) {
            System.out.println("Congratulations!");
            {
               if (guess == 1) {
                  System.out.println("You have tried " + guess + " time");
               } else if (guess != 1) {
                  System.out.println("You have tried " + guess + " times");
               }

               break;

            }
         } else if (guessing > random) {
            {
               System.out.println("Try a lower number!");

               {
                  if (guess == 5) {
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + random);
                     break;
                  }
               }

               guess = guess + 1;

            }

         } else if (guessing < random) {
            {
               System.out.println("Try a higher number!");

               {
                  if (guess == 5) {
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + random);
                     break;
                  }
               }

               guess = guess + 1;

            }

         }

      }
      scanner.close();
   }
}


