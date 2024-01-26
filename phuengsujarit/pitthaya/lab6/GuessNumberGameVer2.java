package phuengsujarit.pitthaya.lab6;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 implements HasRule{ 


    public GuessNumberGameVer2 (){ // create constructors
        super();
    }

    public GuessNumberGameVer2 (int minNum,int maxNum,int maxTries){
        super(minNum,maxNum,maxTries);
    }

    @Override // adjust gamerule method 
    public void gameRule(){
        System.out.println("Guess Number Game Rules : ...");
    }
   
    @Override 
    public String toString() {
        return "Guess Number Game Version 2 : "+super.toString() ;
    }

    @Override
    public void playGame() {
        System.out.println("Playing Guess Number Game Version2");

    }
}
    
