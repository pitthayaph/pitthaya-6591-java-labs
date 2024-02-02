package phuengsujarit.pitthaya.lab7;

import java.util.Comparator;

public class SortByMaxTriesGuessRange implements Comparator<GuessNumberGameVer4> {
    
    @Override //compare range of guess if maxtry is equar.
    public int compare(GuessNumberGameVer4 game1, GuessNumberGameVer4 game2) {
        int guessRange1 = game1.getMaxNum() - game1.getMinNum();
        int guessRange2 = game2.getMaxNum() - game2.getMinNum();
        int maxTriesComparison = Integer.compare(game1.getMaxTries(), game2.getMaxTries());
        if (maxTriesComparison != 0) {
            return maxTriesComparison;
        } else {
                return Integer.compare(guessRange2,guessRange1);
        }
    }
}
