import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    int initialPosition = 0;
    int finalPosition = 0;
    int size = 0;
    ArrayList<Jumper> jumper;
    HashMap<Integer, Integer> mapJumper = new HashMap();
    
    public Board(int size, ArrayList<Jumper> jumper) {
        this.size = size;
        this.jumper = jumper;

        addJumperToMap(this.jumper);
    }

    public void addJumperToMap(ArrayList<Jumper> jumper) {
        for (int i = 0; i < jumper.size(); i++) {
            if (!mapJumper.containsKey(jumper.get(i).getInitialPosition())) {
                mapJumper.put(jumper.get(i).getInitialPosition(), jumper.get(i).getFinalPosition());
            }
        }
    }

    public void loadGame(int currentScore, int diceScore) {
        int score = currentScore + diceScore;
        if (score == size) {
            finalPosition = score;
            System.out.println("Win");
        }

        if (score < size) {
            if (mapJumper.containsKey(score)) {
                finalPosition = (int) mapJumper.get(score);
            } else {
                finalPosition = score;
            }
        }
    }

    public int getCurentPlayerScore() {
        return this.finalPosition;
    }

}
