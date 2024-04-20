import ex10_1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Niklas
 */
class FishtankTest {
    Fishtank fishtank;
    //whole lot of creatures
    Bellyray b1;
    Bellyray b2;
    Bellyray b3;
    Huddlefish h1;
    Huddlefish h2;
    Huddlefish h3;
    KeeperLeviathan k1;
    KeeperLeviathan k2;
    KeeperLeviathan k3;
    Pampeel p1;
    Pampeel p2;
    Pampeel p3;
    PeaDragonLeviathan pd1;
    PeaDragonLeviathan pd2;
    PeaDragonLeviathan pd3;
    Quidshark q1;
    Quidshark q2;
    Quidshark q3;


    @BeforeEach
    void setUp() throws SizeException {
        try {
            //create new fishtank
            fishtank = new Fishtank();
            //create new creatures
            b1 = new Bellyray(700);
            b2 = new Bellyray(800);
            b3 = new Bellyray(790);
            h1 = new Huddlefish(80);
            h2 = new Huddlefish(90);
            h3 = new Huddlefish(85);
            k1 = new KeeperLeviathan(5400);
            k2 = new KeeperLeviathan(5500);
            k3 = new KeeperLeviathan(5450);
            p1 = new Pampeel(2000);
            p2 = new Pampeel(2110);
            p3 = new Pampeel(2105);
            pd1 = new PeaDragonLeviathan(11000);
            pd2 = new PeaDragonLeviathan(11600);
            pd3 = new PeaDragonLeviathan(11300);
            q1 = new Quidshark(1100);
            q2 = new Quidshark(1200);
            q3 = new Quidshark(1150);

        } catch (SizeException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    void createCreature() {
        assertEquals(700, b1.getSize());
        assertEquals(800, b2.getSize());
        assertEquals(790, b3.getSize());
        assertThrowsExactly(SizeException.class, () -> new Bellyray(400));
    }

    @Test
    void addCreature() {
        fishtank.addCreature(b1);
        fishtank.addCreature(b2);
        fishtank.addCreature(b3);
        fishtank.addCreature(h1);
        fishtank.addCreature(h2);
        fishtank.addCreature(h3);
        fishtank.addCreature(k1);
        fishtank.addCreature(k2);
        fishtank.addCreature(k3);
        fishtank.addCreature(p1);
        fishtank.addCreature(p2);
        fishtank.addCreature(p3);
        fishtank.addCreature(pd1);
        fishtank.addCreature(pd2);
        fishtank.addCreature(pd3);
        fishtank.addCreature(q1);
        fishtank.addCreature(q2);
        fishtank.addCreature(q3);

        assertEquals(12, fishtank.getNumOfCreatures());
    }
    @Test
    void filterByType() {
        fishtank.addCreature(b1);
        fishtank.addCreature(b2);
        fishtank.addCreature(b3);
        fishtank.addCreature(h1);
        fishtank.addCreature(h2);
        fishtank.addCreature(h3);
        fishtank.addCreature(k1);
        fishtank.addCreature(k2);
        fishtank.addCreature(k3);
        fishtank.addCreature(p1);
        fishtank.addCreature(p2);
        fishtank.addCreature(p3);
        fishtank.addCreature(pd1);
        fishtank.addCreature(pd2);
        fishtank.addCreature(pd3);
        fishtank.addCreature(q1);
        fishtank.addCreature(q2);
        fishtank.addCreature(q3);
        //filter for Huddlefish
        //create testlist for Huddlefish
        ArrayList<Huddlefish> testListHuddlefish = new ArrayList<>();
        testListHuddlefish.add(h1);
        testListHuddlefish.add(h2);
        testListHuddlefish.add(h3);
        assertEquals(testListHuddlefish, fishtank.filterByType(Huddlefish.class));
        //filter for Bellyray
        //create testlist for Bellyray
        ArrayList<Bellyray> testListBellyray = new ArrayList<>();
        testListBellyray.add(b1);
        testListBellyray.add(b2);
        testListBellyray.add(b3);
        assertEquals(testListBellyray, fishtank.filterByType(Bellyray.class));
        //filter for Carnivore
        //create testlist for Carnivore
        ArrayList<Carnivore> testListCarnivore = new ArrayList<>();
        testListCarnivore.add(q1);
        testListCarnivore.add(q2);
        testListCarnivore.add(q3);
        testListCarnivore.add(p1);
        testListCarnivore.add(p2);
        testListCarnivore.add(p3);
        assertEquals(testListCarnivore, fishtank.filterByType(Carnivore.class));
    }

    @Test
    void filterBySize() {
        fishtank.addCreature(b1);
        fishtank.addCreature(b2);
        fishtank.addCreature(b3);
        fishtank.addCreature(h1);
        fishtank.addCreature(h2);
        fishtank.addCreature(h3);
        fishtank.addCreature(k1);
        fishtank.addCreature(k2);
        fishtank.addCreature(k3);
        fishtank.addCreature(p1);
        fishtank.addCreature(p2);
        fishtank.addCreature(p3);
        fishtank.addCreature(pd1);
        fishtank.addCreature(pd2);
        fishtank.addCreature(pd3);
        fishtank.addCreature(q1);
        fishtank.addCreature(q2);
        fishtank.addCreature(q3);
        //filter for size 80 and 500
        //create testlist for size
        ArrayList<Seacreature> testListSize80 = new ArrayList<>();
        testListSize80.add(h1);
        testListSize80.add(h2);
        testListSize80.add(h3);
        assertEquals(testListSize80, fishtank.filterBySize(80, 500));
        //filter for size 700 and 9000
        //create testlist for size
        ArrayList<Seacreature> testListSize700 = new ArrayList<>();
        testListSize700.add(b1);
        testListSize700.add(b2);
        testListSize700.add(b3);
        testListSize700.add(p1);
        testListSize700.add(p2);
        testListSize700.add(p3);
        testListSize700.add(q1);
        testListSize700.add(q2);
        testListSize700.add(q3);
        assertEquals(testListSize700, fishtank.filterBySize(700, 9000));
        //filter for size 1100 and 2200
        //create testlist for size
        ArrayList<Seacreature> testListSize1100 = new ArrayList<>();
        testListSize1100.add(p1);
        testListSize1100.add(p2);
        testListSize1100.add(p3);
        testListSize1100.add(q1);
        testListSize1100.add(q2);
        testListSize1100.add(q3);
        assertEquals(testListSize1100, fishtank.filterBySize(1100, 2200));
    }
}