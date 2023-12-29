package phuengsujarit.pitthaya.lab4;

import java.util.*;

public class GuessNumberGamesV3 {
    
   static int answer, min, max, numTries, maxTries,totalwin,highscore; // define variable.
   static Scanner input = new Scanner(System.in); // define variable to get input.
   static int[] guesses; // declares an array for store player's answer
   static int guesseslist;
   static boolean win;
   static float winrate,Avgguess;
   static float gameplayed = 1;
   static int totaltries;
   

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

   }

   public static void genAnswer() { // define genAnswer function to random answer.
      answer = min + (int) (Math.random() * ((max - min) + 1));
   }

   public static void playgame() { // define playgame function.
      Math.random();
      System.out.println("Welcome to a number guessing game!");
      guesses = new int[maxTries]; // set length of an array to maxTries.
      guesseslist = 0;
      int guessing;

      int numTries = 1;
      while (numTries < maxTries + 1) { // the game will lunch while numTries < maxTries .

         do {
            System.out.print("Enter an integer between " + min + "and" + max + ":");
            guessing = input.nextInt();

            do {
               if (guessing < min || guessing > max) {
                  System.out.print("ํYour guess should be in [" + min + "," + max + "]:"); // warning player to input correctly.
                  guessing = input.nextInt();
               }
            } while (guessing < min || guessing > max);

         } while (guessing < min || guessing > max);

         guesses[guesseslist] = guessing; // store player's answer to an array.
         guesseslist++;

         if (guessing == answer) { // check if player's answer is correct.
            System.out.println("Congratulations!");
            win = true;
            totalwin ++;
            break;

         } else if (guessing > answer) { // check if player's answer higher than real answer.
            {
               System.out.println("Try a lower number!");

               {
                  if (numTries == maxTries) { // check if game over.
                     System.out.print("You ran out of guesses.");
                     System.out.println("The answer was " + answer);
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
                     System.out.print("You ran out of guesses.");
                     System.out.println("The answer was " + answer);
                     break;
                  }
               }

               numTries = numTries + 1;
            }
         }
      }
      System.out.print("Enter 'a' to list all guesses, 'g' for a specific guess, or any other key to quit: ");
      String choice = input.next().toLowerCase();
      while (choice.equals("a") || choice.equals("g")) {

         if (choice.equals("a")) {
            System.out.println("All guesses:");
            for (int i = 0; i < guesseslist; i++) {
               System.out.print(guesses[i] + " ");
            }
            System.out.println("");
            System.out.print("Enter 'a' to list all guesses, 'g' for a specific guess, or any other key to quit: ");
            choice = input.next().toLowerCase();
         } else if (choice.equals("g")) {
            System.out.print("Enter the number of the guess you want to see (1-" + maxTries + "): ");
            int guessNumber = input.nextInt();
            if (guessNumber >= 1 && guessNumber <= guesseslist) {
               System.out.println("Guess " + guessNumber + ": " + guesses[guessNumber - 1]);
               System.out.print("Enter 'a' to list all guesses, 'g' for a specific guess, or any other key to quit: ");
               choice = input.next().toLowerCase();
            } else {
               System.out.println("Invalid guess number.");
               System.out
                     .println("Enter 'a' to list all guesses, 'g' for a specific guess, or any other key to quit: ");
               choice = input.next().toLowerCase();
            }
         }
      }
      if (highscore == 0 || numTries < highscore){
        highscore = numTries;


      }
      totaltries = totaltries + numTries;
      
      System.out.println("Game Log: Answer: "+answer+", Guesses: "+numTries+", Win: "+win); //show game log
      System.out.print("Want to play again (Y or y):"); //ask for play again
      String playagain = input.next().toLowerCase();
      if (playagain.equals("y")) {
         guessing = 0;
         guesseslist = 0;
         win = false;
         gameplayed ++;
         
         genAnswer(); // generate new answer 
         playgame();


      }
      else{
        winrate = (totalwin/gameplayed) *100; // calculate winrate 
        Avgguess = (totaltries/gameplayed); // calculate average guess per game
        
        
        System.out.println("----- Game Statistics -----");
        System.out.println("Total games played: "+gameplayed);
        System.out.println("Total wins: "+totalwin);
        System.out.println("Win Ratio: "+winrate);
        System.out.println("Average guess per game: "+Avgguess);
        if (totalwin > 0) {
        System.out.println("High Score (Least Guesses): " + highscore);
    } else {
        System.out.println("High Score (Least Guesses): N/A");
    }
        }

      input.close(); // close scanner

   }
}


    

