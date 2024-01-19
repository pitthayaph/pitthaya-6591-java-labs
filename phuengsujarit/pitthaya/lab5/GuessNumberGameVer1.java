package phuengsujarit.pitthaya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 { // pitthaya.ph 663040659-1

   protected int minNum, maxNum, maxTries; // declae variable
   protected int correctNum;
   protected static int numOfGames = 0;
   Scanner input;

   public static int getNumOfGames() { // getter and setter
      return numOfGames;
   }

   public int getMinNum() {
      return minNum;
   }

   public void setMinNum(int minNum) {
      this.minNum = minNum;
   }

   public int getMaxNum() {
      return maxNum;
   }

   public void setMaxNum(int maxNum) {
      this.maxNum = maxNum;
   }

   public int getMaxTries() {
      return maxTries;
   }

   public void setMaxTries(int maxTries) {
      this.maxTries = maxTries;
   }

   public GuessNumberGameVer1() { // construtor

      minNum = 1;
      maxNum = 10;
      correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
      maxTries = 3;
      numOfGames = numOfGames + 1;

   }

   public GuessNumberGameVer1(int minNum, int maxNum) {

      this.minNum = minNum;
      this.maxNum = maxNum;
      correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
      maxTries = 3;
      numOfGames = numOfGames + 1;

   }

   public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
      this.minNum = minNum;
      this.maxNum = maxNum;
      correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
      this.maxTries = maxTries;
      numOfGames = numOfGames + 1;

   }

   public void playGame() { // main game
      int numTries = 1;
      int guessing;
      input = new Scanner(System.in);

      System.out.println("Welcome to a number guessing game!");
      while (numTries < maxTries + 1) { // the game will lunch while numTries < maxTries .
         do {
            System.out.print("Enter an integer between " + minNum + " and " + maxNum + ":");
            guessing = input.nextInt();

         } while (guessing < minNum || guessing > maxNum);

         if (guessing == correctNum) { // check if player's answer is correct.
            System.out.println("Congratulations!");
            {
               if (numTries == 1) {
                  System.out.println("You have tried " + numTries + " time");
               } else if (numTries != 1) {
                  System.out.println("You have tried " + numTries + " times");
               }

               break;

            }
         } else if (guessing > correctNum) { // check if player's answer higher than real answer.
            {
               System.out.println("Try a lower number!");

               {
                  if (numTries == maxTries) { // check if game over.
                     System.out.println("You have tried " + numTries + " times. You ran out of guesses");
                     System.out.println("The answer is " + correctNum);
                     break;
                  }
               }

               numTries = numTries + 1;

            }

         } else if (guessing < correctNum) { // check if player's answer lower than real answer.
            {
               System.out.println("Try a higher number!");

               {
                  if (numTries == maxTries) { // check if game over.
                     System.out.println("You have tried " + numTries + " times. You ran out of guesses");
                     System.out.println("The answer is " + correctNum);
                     break;
                  }
               }

               numTries = numTries + 1;
            }
         }
      }

   }

   @Override // show minnum maxnum and maxTries
   public String toString() {
      return "GuessNumberGame with min number as " + minNum + " max number as " + maxNum + " max number of tries as "
            + maxTries;

   }

}
