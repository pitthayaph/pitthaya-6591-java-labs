package phuengsujarit.pitthaya.lab7;

import phuengsujarit.pitthaya.lab5.GuessNumberGameVer3;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {

    public GuessNumberGameVer4 () { //create constructors
        super();
    }
    
    public GuessNumberGameVer4 (int minNum,int maxNum) {
        super(minNum,maxNum);
    }
    
    public GuessNumberGameVer4 (int minNum,int maxNum, int maxTries) {
        super(minNum,maxNum,maxTries);
    }
    
    @Override
    public String toString() {
        return "GuessNumberGameVer4 (min:"+minNum + ", max:"+maxNum+", max tries:"+maxTries+")";
    }
}
