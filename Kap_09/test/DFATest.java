import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DFATest {
    //create states
    State q0 = new State("q0", false);
    State q1 = new State("q1", false);
    State q2 = new State("q2", false);
    State q3 = new State("q3", true);

    //create alphabet
    Character[] chars = {'a', 'b', 'c'};
    Alphabet alphabet = new Alphabet(chars);

    //create DFA
    DFA dfa = new DFA(alphabet);
    @BeforeEach
    void setUp() {
        //method to run the scenario for an exmaple DFA
        //add states to DFA
        dfa.addState(q0, true);
    }

    @org.junit.jupiter.api.Test
    void reset() {
        //make changes then reset
        dfa.makeTransition("q0", "q1", 'a');
        dfa.makeTransition("q1", "q0", 'b');
        dfa.reset();
        //check if the current state is the start state
        assertEquals(dfa.current, dfa.start);
    }

    @org.junit.jupiter.api.Test
    void isAccepting() {
        //make changes then check if the current state is an accepting state
        dfa.makeTransition("q0", "q1", 'a');
        dfa.makeTransition("q1", "q2", 'b');
        dfa.makeTransition("q2", "q3", 'c');
        assertTrue(dfa.isAccepting());
    }

    @org.junit.jupiter.api.Test
    void makeTransition() {
        //check if the state after a transition is what is expected
        dfa.makeTransition("q0", "q1", 'a');
        assertEquals("q1", dfa.current);
        dfa.makeTransition("q1", "q0", 'b');
        assertEquals("q0", dfa.current);
    }

    @org.junit.jupiter.api.Test
    void delta() {
        //check if the state after a transition is what is expected
        dfa.delta('a');
        assertEquals("q1", dfa.current);
        dfa.delta('b');
        assertEquals("q0", dfa.current);
    }
}
