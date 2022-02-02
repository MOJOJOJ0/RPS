import java.util.Locale;
import java.util.Scanner;

public class PlayRPSGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GamePlay gamePlay = new GamePlay();
        char quit = ' ';

        while ( quit != 'N') {
            gamePlay.play();

            System.out.println("Play Again? Press Any Key to Continue or 'N' to Quit");
            quit = scan.nextLine().toUpperCase().charAt(0);
        }

        scan.close();
        gamePlay.displayStats();

    }
}
