package phuengsujarit.pitthaya.lab6;

public class DungeonsAndDragonsGame  extends CardGame implements HasRule,UseBoard,UseDice { //implements  3 interface
    
    public DungeonsAndDragonsGame () { //create constructors 
        super();
        gameName = "Dungeons And Dragons Game";
        numOfPlayers = 3;
    }

    public DungeonsAndDragonsGame (int numOfCardsPerPlayer) {
        super(numOfCardsPerPlayer);
        gameName = "Dungeons And Dragons Game";
        numOfPlayers = 3;
    }

    @Override // override tostring method
    public String toString() {
        return "Dungeons And Dragons Game : "+super.toString();
    }

    @Override //override playgame
    public void playGame() {
        System.out.println("Playing Dungeons And Dragons Game");
    }

    @Override //adjust gamerule method
    public void gameRule() {
        System.out.println("Dungeons And Dragons Game Rules : ...");
    }

    @Override //adjust setupboard method
    public void setUpBoard() {
        System.out.println("Setting up board for Dungeons And Dragons Game");
    }

    @Override //adjust rolldice method
    public void rollDice() {
        System.out.println("Rolling 2 dices for Dungeons And Dragons Game");
    }
}
