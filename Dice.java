import java.util.Random;

public class Dice {
    int data = 0;

    public int getDiceValue() {
        Random rn = new Random();
        int answer = rn.nextInt(6) + 1;
        return answer;
    }
}
