package ex10_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
public class Fishtank {
    private ArrayList<Seacreature> creatures;

    public Fishtank() {
        creatures = new ArrayList<>();
    }

    /**
     * Adds a creature to the fishtank.
     * @param creature the creature to be added
     */
    public void addCreature(Seacreature creature) {
        try {
            if (creature == null) {
                throw new IllegalArgumentException("Creature must not be null.");
            }
            if (creature instanceof Leviathan) {
                throw new SizeException("Leviathans are not allowed in the fishtank.");
            }
            //if these are not met, add the creature to the tank
            creatures.add(creature);
        } catch (SizeException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to return the number of creatures in the tank
     * @return the number of creatures in the tank
     */
    public int getNumOfCreatures() {
        return creatures.size();
    }

    /**
     * method to filter the aquarium for a specific type of creature
     * @param creature the type of creature to be filtered
     *             (e.g. "Herbivore", "Carnivore", "Leviathan")
     * @return a list of all creatures of the given type
     */
    public <T extends Seacreature> List<T> filterByType(Class<T> creature) {
        //create new list to store the filtered creatures
        List<T> filteredCreatures = new ArrayList<>();
        //iterate over all creatures in the tank
        for (Seacreature thing : creatures) {
            //if the creature is of the given type, add it to the list
            if (thing.getClass().isInstance(creature)) {
                filteredCreatures.add((T) thing);
            }
        }
        return filteredCreatures;
    }



    /**
     * method to filter the aquarium for a specific size range of creature
     * @param sizeL the lowest size of the creature to be filtered
     * @param sizeH the highest size of the creature to be filtered
     * @return a list of all creatures of the given size
     */
    public <T> List<T> filterBySize(int sizeL, int sizeH) {
        //create new list to store the filtered creatures
        List<T> filteredCreatures = new ArrayList<>();
        //iterate over all creatures in the tank
        for (Seacreature seacreature : creatures) {
            //if the creature is of the given size, add it to the list
            if (seacreature.getSize() >= sizeL && seacreature.getSize() <= sizeH) {
                filteredCreatures.add((T) seacreature);
            }
        }
        return filteredCreatures;
    }
}

