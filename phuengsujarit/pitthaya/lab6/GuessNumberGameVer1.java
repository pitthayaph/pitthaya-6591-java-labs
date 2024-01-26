package phuengsujarit.pitthaya.lab6;

public class GuessNumberGameVer1 extends Game {

    protected int minNum, maxNum, correctNumber, maxTries;

    public GuessNumberGameVer1() { //create constructors and declar variable
        super("Guess Number Game", 1); 
        this.minNum = 1;
        this.maxNum =10;
        this.correctNumber = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        maxTries = 3;
    }

    public GuessNumberGameVer1(int minNum,int maxNum){
        super("Guess Number Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNumber  = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {

        super("Guess Number Game", 1);
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
        this.correctNumber  = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
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

    @Override
    public String toString() { //override toString method
        return super.toString() + "{ minNum='" + minNum + "', maxNum='" + maxNum + "', correctNum='" + correctNumber
                + "', maxTries= '" + maxTries+"'}";
    }

    @Override
    public void playGame() { //override playGame method
        System.out.println("Playing Guess Number Game");

    }
}