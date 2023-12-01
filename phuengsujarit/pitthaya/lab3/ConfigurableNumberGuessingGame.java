package phuengsujarit.pitthaya.lab3;

import java.util.Scanner;

public class ConfigurableNumberGuessingGame {
    static int answer , min,max, numTries, maxTries;
    static Scanner input = new Scanner (System.in);

    
    public static void genAnswer() {
        answer = 1 + (int) (Math.random() * ((20 - 1) + 1));
    }
    
    
    
    public static void playgame() {
      Math.random();
      System.out.println("Welcome to a number guessing game!");
      Scanner sc = new Scanner(System.in);
      int guess = 1;
      while (guess < 6) {
         System.out.print("Enter an integer between 1 and 20:");
         int guessing = sc.nextInt();

         if (guessing == answer) {
            System.out.println("Congratulations!");
            {
               if (guess == 1) {
                  System.out.println("You have tried " + guess + " time");
               } else if (guess != 1) {
                  System.out.println("You have tried " + guess + " times");
               }

               break;

            }
         } else if (guessing > answer) {
            {
               System.out.println("Try a lower number!");

               {
                  if (guess == 5) {
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  }
               }

               guess = guess + 1;

            }

         } else if (guessing < answer) {
            {
               System.out.println("Try a lower number!");

               {
                  if (guess == 5) {
                     System.out.println("You have tried 5 times. You ran out of guesses");
                     System.out.println("The answer is " + answer);
                     break;
                  }
               }

               guess = guess + 1;
            }
        }
      }
   }
    public static void main(String[]args){
        genAnswer();
        playgame();
        configure();
      
      
      }


    
    
}
