package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public abstract class Seacreature {
    //size is measured in centimeters
    private int size;

    public Seacreature(int size) {
        this.size = size;
    }

    /**
     *getter for size
     * @return size of creature
     */
    public int getSize() {
        return size;
    }
}
