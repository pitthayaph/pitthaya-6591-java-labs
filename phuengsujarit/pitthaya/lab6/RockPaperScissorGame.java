package phuengsujarit.pitthaya.lab6;

public class RockPaperScissorGame extends Game {

    protected String player1Choice, player2Choice;

    public RockPaperScissorGame() { //create constructors method
        super("Rock Paper Scissor Game", 2);
        this.player1Choice = "rock";
        this.player2Choice = "rock";
    }

    public RockPaperScissorGame(String player1Choice, String player2choice) {
        super("Rock Paper Scissor Game", 2);
        this.player1Choice = player1Choice;
        this.player2Choice = player2choice;
    }

    public String getPlayer1Choice() { //create getter and setter method
        return player1Choice;
    }

    public void setPlayer1Choice(String player1Choice) {
        this.player1Choice = player1Choice;
    }

    public String getPlayer2Choice() {
        return player2Choice;
    }

    public void setPlayer2Choice(String player2Choice) {
        this.player2Choice = player2Choice;
    }

    @Override
    public String toString() { //override toString method 
        return super.toString() + "{ player1Choice='" + player1Choice + "', player2Choice='" + player2Choice + "'}";
    }

    @Override //override playgame medthod
    public void playGame() {
        System.out.println("Playing Rock Paper Scissor Game");
    }
}
