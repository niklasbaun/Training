import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahlberg, Kilian; Walter, Annika; Baun, Nikas
 */
class LambdaTest {
    //create objects of arraylist
    String s1 = "Hello";
    String s2 = "World";
    String s3 = "What";
    String s4 = "is";
    String s5 = "up";
    String s6 = "with";
    String s7 = "you";
    String s8 = "today";
    String s9 = "I";
    String s10 = "don't";
    String s11 = "care";


    //create the arraylist
    ArrayList<String> list = new ArrayList<>();
    @BeforeEach
    void setUp(){
        //fill the arraylist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
    }

    @org.junit.jupiter.api.Test
    void removeIf() {
        //create a copy of the list to test
        ArrayList<String> test1 = list;
        //remove all words with length 5
        ex11_1.removeIf(test1, s -> s.length() == 5);
        //check if the words are removed
        assertEquals(7, test1.size());

        //remove words that start with "w"
        ArrayList<String> test2 = list;
        ex11_1.removeIf(test2, s -> s.startsWith("w"));
        //check if the words are removed
        assertEquals(6, list.size());
    }

    @org.junit.jupiter.api.Test
    void sortBy() {
        //create a copy of the list to test
        ArrayList<String> test1 = list;
        //sort the list by length
        ex11_1.sortBy(test1, (s1, s2) -> s1.length() - s2.length());
        //check if the list is sorted
        assertEquals(s9, test1.get(0));
        assertEquals(s4, test1.get(1));
        assertEquals(s5, test1.get(2));
        assertEquals(s7, test1.get(3));
        assertEquals(s3, test1.get(4));
        assertEquals(s6, test1.get(5));
        assertEquals(s11, test1.get(6));
        assertEquals(s1, test1.get(7));
        assertEquals(s2, test1.get(8));
        assertEquals(s8, test1.get(9));
        assertEquals(s10, test1.get(10));
    }

    @org.junit.jupiter.api.Test
    void listToString() {
        //create a copy of the list to test
        ArrayList<String> test1 = list;
        //convert the list to a string
        String test = ex11_1.listToString(test1);
        //compare string, where each word is in a new line
        String compare = "Hello\nWorld\nWhat\nis\nup\nwith\nyou\ntoday\nI\ndon't\ncare\n";
        assertEquals(compare, test);

    }
}