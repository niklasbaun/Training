package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class PeaDragonLeviathan extends Leviathan{

    /**
     * Constructor for PeaDragonLeviathan, with a size only allowed to be between 110m and 116m.
     * @param size size of the PeaDragonLeviathan
     */
    public PeaDragonLeviathan(int size) throws SizeException {
        super(size);
        if (size < 11000 || size > 11600) {
            throw new SizeException("Size must be between 110m and 116m.");
        }
    }
}
