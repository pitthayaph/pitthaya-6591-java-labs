package phuengsujarit.pitthaya.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 { // pitthaya.ph 663040659-1
    protected int[] guesses;
    protected int numGuesses = 0;
    int MAX_GUESSES = 20;

    public GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUESSES];

    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
    }

    @Override
    public void playGame() { // override playgame for increase function
        int numTries = 1;
        int guessing;
        input = new Scanner(System.in);
        System.out.println("Welcome to a number guessing game !");

        while (numTries < maxTries + 1) { // the game will lunch while numTries < maxTries .

            do {
                System.out.print("Enter an integer between " + minNum + " and " + maxNum + ":");
                guessing = input.nextInt();

                do {
                    if (guessing < minNum || guessing > maxNum) {
                        System.out.print("ํYour guess should be in [" + minNum + "," + maxNum + "]:"); // warning player to input correctly.
                         guessing = input.nextInt();
                    }
                } while (guessing < minNum || guessing > maxNum);
             } while (guessing < minNum || guessing > maxNum);
             guesses[numGuesses] = guessing; // store player's answer to an array.
            numGuesses++;

            if (guessing == correctNum) { // check if player's answer is correct.
                System.out.println("Congratulations!");
                break;

            } else if (guessing > correctNum) { // check if player's answer higher than real answer.
                {
                    System.out.println("Try a lower number!");

                    {
                        if (numTries == maxTries) { // check if game over.
                            System.out.print("You ran out of guesses.");
                            System.out.println("The answer was " + correctNum);
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
                            System.out.print("You ran out of guesses.");
                            System.out.println("The answer was " + correctNum);
                            break;
                        }
                    }

                    numTries = numTries + 1;
                }
            }
        }

    }

    public void showSpecific() { // show specific guesses 

        System.out.print("Enter which guess in the range (1-" + numGuesses + ") ");
        int guessNumber = input.nextInt();
        if (guessNumber >= 1 && guessNumber <= numGuesses) {
            System.out.println("Guess number " + guessNumber + " is " + guesses[guessNumber - 1]);
        }

    }

    public void showGuesses() { // show all guesses 

        for (int i = 0; i < numGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println("");

    }

    public void playGames() {  // control program flow

        playGame();

        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit: ");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            String choice = input.next().toLowerCase();

            switch (choice) { // make choice for user
                case "a":
                    showGuesses();
                    break;
                case "g":
                    showSpecific();
                    break;
                case "y":
                    guesses = new int[MAX_GUESSES];
                    numGuesses = 0;
                    correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
                    playGame();
                    break;
                case "q":
                    return;
                default:

                    break; 
            }
        }
    }
}
