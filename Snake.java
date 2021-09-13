public class Snake implements Jumper {

    private int initialPosition = 0;
    private int finalPosition = 0;

    public Snake(int initialPosition, int finalPosition) {
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
    }

    @Override
    public int getInitialPosition() {
        return this.initialPosition;
    }

    @Override
    public int getFinalPosition() {
        return this.finalPosition;
    }

}
