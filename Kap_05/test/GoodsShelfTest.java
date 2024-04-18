import ex5_5.GoodsCrate;
import ex5_5.GoodsShelfSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoodsShelfTest {

    /**
     * method to test the add method
     */
    @Test
    void findSegmentForCrate() {
        GoodsShelfSystem system = new GoodsShelfSystem();
        GoodsCrate crate = new GoodsCrate(1, 1, 1, 1);
        //add a crate to the system
        assertTrue(system.findSegmentForCrate(crate));
        //find where the crate is
        int[] expected = {4, 0};
        assertArrayEquals(expected, system.findCrate(crate));

        //add another crate to the system
        //should go to other segment
        GoodsCrate crate2 = new GoodsCrate(1, 1, 1, 400);
        assertTrue(system.findSegmentForCrate(crate2));

        //should be too heavy
        GoodsCrate crate3 = new GoodsCrate(1, 1, 1, 500);
        assertFalse(system.findSegmentForCrate(crate3));

        //too big
        GoodsCrate crate4 = new GoodsCrate(36.89, 40.7, 70, 1);
        assertFalse(system.findSegmentForCrate(crate4));
    }
}
