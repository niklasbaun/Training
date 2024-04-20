package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class Pampeel extends Carnivore{
    /**
     * Constructor for Pampeel with a size only allowed to be between 20m and 22m.
     * @param size the size of the Pampeel
     */
    public Pampeel(int size) throws SizeException {
        super(size);
        if (size < 2000 || size > 2200) {
            throw new SizeException("Size must be between 20m and 22m.");
        }
    }
}
