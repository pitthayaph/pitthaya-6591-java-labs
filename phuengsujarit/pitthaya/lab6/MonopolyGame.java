package phuengsujarit.pitthaya.lab6;

public class MonopolyGame extends Game {

    protected String[] gamePieces;

    public MonopolyGame() { //create constructors and declar variable
        super("Monopoly Game", 4);
        this.gamePieces = new String[] { "car", "top hat", "thimble", "boot" };
    }

    public MonopolyGame(String[] gamePieces) {
        super("Monopoly Game", 4);
        this.gamePieces = gamePieces;
    }

    public String[] getGamePieces() { //create getter and setter method
        return gamePieces;
    }

    public void setGamePieces(String[] gamePieces) {
        this.gamePieces = gamePieces;
    }

    @Override   //override playgame method
    public void playGame() { 
        System.out.println("Playing Monopoly Game");

    }

    @Override
    public String toString() { //override toString method to print array 
        String result = super.toString() + "{ game pieces='";
        for (int i = 0; i < gamePieces.length; i++) {
            result = result  + gamePieces[i] + " ";
        }
        return result + "'}";
    }
}
