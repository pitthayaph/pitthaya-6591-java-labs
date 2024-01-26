package phuengsujarit.pitthaya.lab6;

public class RockPaperScissorGameVer2 extends RockPaperScissorGame implements HasRule{

    public RockPaperScissorGameVer2() {
        super();
    }

    public RockPaperScissorGameVer2(String player1Choice, String player2choice) {
        super(player1Choice,player2choice);
    }
    
    @Override //adjust gamerule method
    public void gameRule(){
        System.out.println("Rock Paper Scissor Rule: ...");
    }
   
    @Override
    public String toString() {
        return "Rock Paper Scissor Game Version 2 : " + super.toString();
    }
    
    @Override
    public void playGame() {
        System.out.println("Playing Rock Paper Scissor Version 2");
    }
}
