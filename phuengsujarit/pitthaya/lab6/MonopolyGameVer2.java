package phuengsujarit.pitthaya.lab6;

public class MonopolyGameVer2 extends MonopolyGame implements HasRule,UseBoard,UseDice{

    public MonopolyGameVer2() {
        super();
    }
    
    public MonopolyGameVer2(String[] gamePieces) {

        super(gamePieces);
    }
     
    @Override //adjust gamerule method
    public void gameRule(){
        System.out.println("Monopoly Rules: ...");
    }
    
    @Override // adjust setupboard method
    public void setUpBoard(){
        System.out.println("Set up monopoly board");
    }
    
    @Override // adjust rolldice method 
    public void rollDice(){
        System.out.println("Roll 2 dice for monopoly game");
    }
   
    @Override
    public String toString() {
        return "Monopoly Game Version 2 : " + super.toString();
    }
    
    @Override
    public void playGame() {
        System.out.println("Playing Monopoly Game Version 2");
    }
}
