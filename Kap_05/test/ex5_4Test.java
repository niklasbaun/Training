import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ex5_4Test {

    /**
     * method to test the caesar algorithm with HGXBO
     * input: "HGXBO"; W = Z
     */
    @Test
    public void decode_HGXBO() {
        assertEquals("KJAER", ex5_4.decode("HGXBO", 'w', 'z'));
    }

    /**
     * method to test the caesar algorithm with DKKLAJ
     * input: "DKKLAJ"; n = R
     */
    @Test
    public void decode_DKKLAJ() {
        assertEquals("HOOPEN", ex5_4.decode("DKKLAJ", 'n', 'R'));
    }

    /**
     * method to test the caesar algorithm with TUFSMJOH
     * input: "TUFSMJOH"; A = Z
     */
    @Test
    public void decode_TUFSMJOH() {
        assertEquals("STERLING", ex5_4.decode("TUFSMJOH", 'A', 'Z'));
    }

    /**
     * method to test the caesar algorithm with VJGFKDDWM
     * input: "VJGFKDDWM"; E = c
     */
    @Test
    public void decode_VJGFKDDWM() {
        assertEquals("THEDIBBUK", ex5_4.decode("VJGFKDDWM", 'E', 'c'));
    }

    /**
     * method to test the caesar algorithm with ZQJCAKJIWOPAN
     * input: "ZQJCAKJIWOPAN"; W = A
     */
    @Test
    public void decode_ZQJCAKJIWOPAN() {
        assertEquals("DUNGEONMASTER", ex5_4.decode("ZQJCAKJIWOPAN", 'W', 'A'));
    }

    /**
     * method to test the caesar algorithm with ZQJCAKJIWOPAN
     * input: "XHZRGFLGJSOFRNS"; G = B
     */
    @Test
    public void decode_XHZRGFLGJSOFRNS() {
        assertEquals("SCUMBAGBENJAMIN", ex5_4.decode("XHZRGFLGJSOFRNS", 'G', 'B'));
    }

}
