package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class Huddlefish extends Herbivore{

    /**
     * Constructor for Huddlefish, with a size only allowed to be between 80cm and 90cm.
     * @param size size of the Huddlefish
     */
    public Huddlefish(int size) throws SizeException {
        super(size);
        if (size < 80 || size > 90) {
            throw new SizeException("Size must be between 80cm and 90cm.");
        }
    }
}
