import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        HashMap<Integer, Player> playerMap = new HashMap<>();
        boolean quit = false;
        ArrayList<Jumper> jumper = new ArrayList<>();
        jumper.add(new Snake(20, 5));
        jumper.add(new Snake(91, 56));
        jumper.add(new Ladder(24, 42));
        jumper.add(new Ladder(62, 98));

        Scanner sc = new Scanner(System.in);
        Board board = new Board(100, jumper);
        Dice dice = new Dice();
        int currentScore = 0;

        System.out.println("Would you like to play the game if yes then press 'y' and if no then press 'q'.");

        while (!quit) {
            String input = sc.next();
            int diceScore = 0;
            if (!input.equals("q")) {

                System.out.println("Play dice : ");
                System.out.println("If you want to play dice press 'p'");

                if (input.equals("p")) {
                    diceScore = dice.getDiceValue();
                    System.out.println(diceScore);
                    board.loadGame(currentScore, diceScore);
                    currentScore = board.getCurentPlayerScore();
                    System.out.println(currentScore);
                }

                if (currentScore == 100) {
                    System.out.println("Player Win");
                    quit = true;
                }

            } else {
                System.out.println("Quit...");
                quit = true;
            }

        }
    }
}
