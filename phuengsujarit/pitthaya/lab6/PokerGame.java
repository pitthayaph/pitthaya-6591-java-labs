package phuengsujarit.pitthaya.lab6;

public class PokerGame extends CardGame implements HasRule {
    
    public PokerGame () { //create constuctors
       super();
       gameName = "Poker Game";
       numOfPlayers = 4;
    }

    public PokerGame (int numOfCardsPerPlayer) {
        super(numOfCardsPerPlayer);
        gameName = "Poker Game";
        numOfPlayers = 4;
    }

    @Override//override tostring method
    public String toString() {
        return super.toString();
    }
   
    @Override//override playgame method
   public void playGame() {
       System.out.println("Playing Poker Game.");
    }
    
   @Override // adjust gamerule method
   public void gameRule() {
    System.out.println("Poker Game Rules : ...");
   }
}
