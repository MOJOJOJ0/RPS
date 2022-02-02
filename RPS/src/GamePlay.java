import java.awt.*;

public class GamePlay extends RPSGameItems{
    private Player player;
    //private Player2 player2;
    private Computer computer;
    private Choices playerChoice;
    private Choices computerChoice;
    private Result result;
    private static int wins;
    private static int loses;
    private static int ties;

    public GamePlay(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResults();
        displayResults();
        stats();
    }

    public void displayStats(){
        System.out.println("You Played " + (wins + loses + ties) + " games");
        System.out.println("You Won " + wins + " times");
        System.out.println("You Lost " + loses + " times");
        System.out.println("Tie Occurred " + ties + " times \n Game Over!");
    }

    private void stats(){
        if(result== result.WIN)
            wins++;
        else if (result==result.LOSE)
            loses++;
        else
            ties++;

    }

    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println(playerChoice + " beats " + computerChoice + ". Player wins!");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + ". Computer wins!");
                break;
            case TIE:
                System.out.println(playerChoice + " equals to " + computerChoice + ". Tie!");
                break;
        }
    }


    private Result getResults(){
        if(playerChoice == computerChoice)
            return Result.TIE;

        switch (playerChoice){
            case ROCK:
                return (computerChoice == Choices.SCISSORS ? Result.WIN: Result.LOSE); // ! short-hand ifElse
            case PAPER:
                return (computerChoice == Choices.ROCK ? Result.WIN: Result.LOSE);
            case SCISSORS:
                return (computerChoice == Choices.PAPER ? Result.WIN: Result.LOSE);
        }

        return Result.LOSE; //never happens
    }



}
