package ex10_1;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class KeeperLeviathan extends Leviathan{

    /**
     * Constructor for KeeperLeviathan, with a size only allowed to be between 54m and 56m.
     * @param size size of the KeeperLeviathan
     */
    public KeeperLeviathan(int size) throws SizeException {
        super(size);
        if (size < 5400 || size > 5600) {
            throw new SizeException("Size must be between 54m and 56m.");
        }
    }
}
