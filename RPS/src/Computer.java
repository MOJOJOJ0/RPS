import java.awt.*;
import java.util.Random;

public class Computer extends RPSGameItems {
    private final Random random;

    public Computer() {
        super();
        random = new Random();
    }

    public Choices getChoice() {
        int choice = 1 + random.nextInt(3); // ! 1, 2, or 3

        switch (choice) {
            case 1:
                return Choices.ROCK;

            case 2:
                return Choices.PAPER;


        }
        return Choices.SCISSORS; // ! if neither 1 nor 2 then this gets returned instead
    }

}
