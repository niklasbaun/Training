import ex7_2.Hexadecimal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class hex_test {

    //to test the hex method
    @Test
    public void addTest(){
        Hexadecimal hex = new Hexadecimal("1A");
        Hexadecimal hex2 = new Hexadecimal("1");
        hex.add(hex2);
        assertEquals("1b", hex.getValue());

        Hexadecimal hex3 = new Hexadecimal("1C");
        Hexadecimal hex4 = new Hexadecimal("C");
        hex3.add(hex4);
        assertEquals("28", hex3.getValue());
    }

    @Test
    public void subtractTest(){
        Hexadecimal hex = new Hexadecimal("1A");
        Hexadecimal hex2 = new Hexadecimal("1");
        hex.subtract(hex2);
        assertEquals("19", hex.getValue());

        Hexadecimal hex3 = new Hexadecimal("1C");
        Hexadecimal hex4 = new Hexadecimal("C");
        hex3.subtract(hex4);
        assertEquals("10", hex3.getValue());
    }

    @Test
    public void multiplyTest(){
        Hexadecimal hex = new Hexadecimal("1A");
        Hexadecimal hex2 = new Hexadecimal("2");
        hex.multiply(hex2);
        assertEquals("34", hex.getValue());

        Hexadecimal hex3 = new Hexadecimal("1C");
        Hexadecimal hex4 = new Hexadecimal("C");
        hex3.multiply(hex4);
        assertEquals("150", hex3.getValue());
    }

    @Test
    public void divideTest(){
        Hexadecimal hex = new Hexadecimal("1A");
        Hexadecimal hex2 = new Hexadecimal("2");
        hex.divide(hex2);
        assertEquals("d", hex.getValue());

        Hexadecimal hex3 = new Hexadecimal("1C");
        Hexadecimal hex4 = new Hexadecimal("C");
        hex3.divide(hex4);
        assertEquals("2", hex3.getValue());
    }
}
