import java.awt.*;
import java.util.Scanner;

public class Player extends RPSGameItems{

    Scanner scan;

    public Player(){
        super();
        scan = new Scanner(System.in); // ! keyboard inputs
    }

    public Choices getChoice(){
        System.out.println("Please Enter Your Choice: Rock, Paper, Scissors");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice){
            case 'R':
                return Choices.ROCK; // !
            case 'P':
                return Choices.PAPER;
            case 'S':
                return Choices.SCISSORS;
        }
        System.out.println("INVALID INPUT!");
        return getChoice();

    }
}
