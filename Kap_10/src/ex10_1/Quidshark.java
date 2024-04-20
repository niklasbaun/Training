package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class Quidshark extends Carnivore{

    /**
     * Constructor for Quidshark with a size only allowed to be between 11m and 12m.
     * @param size the size of the Quidshark
     */
    public Quidshark(int size) throws SizeException {
        super(size);
        if (size < 1100 || size > 1200) {
            throw new SizeException("Size must be between 11m and 12m.");
        }
    }
}
