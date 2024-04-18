package ex5_2;

public class Position {
    private final int x;
    private final int y;

    /**
     * constructor for position class
     * @param x
     * @param y
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter methods
     * @return x or y
     */
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
