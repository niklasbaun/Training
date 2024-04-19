import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ex8_1_test {
    /**
     * method to test the replace method
     */
    @Test
    public void replace() {
        assertEquals("Hallo Mankel", ex8_1.replace("Hallo Welt", "Welt", "Mankel"));
        assertEquals("xyzdefxyzdef", ex8_1.replace("abcdefabcdef", "abc", "xyz"));
        assertEquals("For a moment, something happened. Then, after a second or so, something continued to happen.", ex8_1.replace("For a moment, nothing happened. Then, after a second or so, nothing continued to happen.", "nothing", "something") );
        assertEquals("Test this boat string to boat the boat method", ex8_1.replace("Test this test string to test the test method", "test", "boat"));
        assertEquals("Sechs schluepfrige Schlangen schlängeln sich langsam ueber den sandigen Strand.", ex8_1.replace("Sechs schlüpfrige Schlangen schlängeln sich langsam über den sandigen Strand.", "ü", "ue"));
        assertEquals("Ich bin dein Mankelo", ex8_1.replace("Ich bin dein Vater", "Vater", "Mankelo"));
    }

}
