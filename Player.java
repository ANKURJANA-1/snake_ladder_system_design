public class Player {
    int id;
    String name;
    int score;
    int position;

    public Player(int id, String name, int score, int position) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }
}