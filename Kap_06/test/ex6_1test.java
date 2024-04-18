import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class ex6_1test {

    /**
     * method to test the reverse method
     */
    @Test
    public void isReverse() {
        assertTrue(ex6_1.isReverse("Hallo Welt", "tleW ollaH"));
        assertTrue(ex6_1.isReverse("forwards", "sdrawrof"));
        assertTrue(ex6_1.isReverse("See!", "eeS"));
        assertTrue(ex6_1.isReverse("netseb eid dnis SaLkin, nailiK, akiNnA!", "Annika, Kilian, Niklas sind die Besten!"));

        assertFalse(ex6_1.isReverse("Hallo Welt", "Hallo Welt"));
        assertFalse(ex6_1.isReverse("Hallo", "Welt"));
        assertFalse(ex6_1.isReverse("See!", "Meer"));
        assertFalse(ex6_1.isReverse("Test", ""));

    }
}
