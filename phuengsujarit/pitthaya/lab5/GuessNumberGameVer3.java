package phuengsujarit.pitthaya.lab5;

public class GuessNumberGameVer3 extends GuessNumberGameVer2 { //pitthaya.ph 663040659-1
   
    public GuessNumberGameVer3() {
        super();

    }

    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);

    }

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);

    }

    public void playGames() { // control program flow
        playGame();
        while (true) {
            System.out.println("If want to play again? type 'y' to continue or 'q' to quit: ");
            System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
            System.out.println(
                    "Type 'v' to show the average of the guesses, 'm' to show the minimum of the guesses, or 'x' show the maximum of the guesses");
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
                case "v":
                    guessAverage();
                    break;
                case "m":
                    guessMin();
                    break;
                case "x":
                    guessMax();
                    break;
                case "q":
                    return;
                default:
                    break; 
            }
        }

    }
    public void guessAverage() {    // calculate average guesses
        int sum = 0;
        for (int i = 0; i < numGuesses; i++) {
            sum += guesses[i];
        }
        double average = (double) sum / numGuesses;
        System.out.println("Average =" + average);
    }

    public void guessMin() { // find minimum number of guesses
        int minGuess = guesses[0];
        for (int i = 1; i < numGuesses; i++) {
            if (guesses[i] < minGuess) {
                minGuess = guesses[i];
            }
        }
        System.out.println("Min = " + minGuess);
    }

    public void guessMax() {  // find maximum number of guesses
        int maxGuess = guesses[0];
        for (int i = 1; i < numGuesses; i++) {
            if (guesses[i] > maxGuess) {
                maxGuess = guesses[i];
            }
        }
        System.out.println("Max = " + maxGuess);
    }

    @Override
    public String toString() { // override min and max
        return "GuessNumberGame with min number as " + minNum + " max number as " + maxNum + " max number of tries as "
                + maxTries;

    }

}
