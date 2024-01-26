package phuengsujarit.pitthaya.lab6;

public abstract class CardGame extends Game {
    protected int numOfCardsPerPlayer;
    
    public CardGame (){  //create constructors
        super();
        this.numOfCardsPerPlayer = 0;
    }

    public CardGame (int numOfCardsPerPlayer) {
        super();
        this.numOfCardsPerPlayer = numOfCardsPerPlayer;
    }
    
    public int getNumOfCardsPerPlayer() { //create getter and setter
        return numOfCardsPerPlayer;
    }

    public void setNumOfCardsPerPlayer(int numOfCardsPerPlayer) {
        this.numOfCardsPerPlayer = numOfCardsPerPlayer;
    }

    @Override //override tostring method
    public String toString(){
        return super.toString() + "{ numOfCardsPerPlayer='" + numOfCardsPerPlayer + "'}";
    }
    
    public abstract void  playGame(); //create abstract playgame method
}
