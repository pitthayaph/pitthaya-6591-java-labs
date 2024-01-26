package phuengsujarit.pitthaya.lab6;

 abstract class Game {
  
    protected  String gameName;
    protected int numOfPlayers;
     
    public Game() {                   //create constructors
        this.gameName = "unknown game";
        this.numOfPlayers = 0;
    }

    public Game(String gameName , int numOfPlayers) { 
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }
    
    public int getNumOfPlayers() {   // create getter and setter method
        return numOfPlayers;
    }
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public String getGameName() {
        return gameName;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    
    public String toString() {
        return   "{ gameName='" + gameName + "', numOfPlayers= '" + numOfPlayers + "'}" +" ";
    } 

    public abstract void playGame(); //create abstract method

}
