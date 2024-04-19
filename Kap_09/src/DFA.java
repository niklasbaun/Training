import java.util.Arrays;

public class DFA extends GenericAutomaton{
    String current;
    /**
     * constructor for GenericAutomaton
     *
     * @param alphabet
     */
    public DFA(Alphabet alphabet) {
        super(alphabet);
    }

    /**
     * method to reset the current state to the start state
     */
    @Override
    void reset() {
        current = start;
    }

    /**
     * method to check if the current state is an accepting state
     * @return true if the current state is an accepting state, false otherwise
     */
    @Override
    boolean isAccepting() {
        for (State s: states) {
            if (s.ID.equals(current)) {
                return s.accepting;
            }
        }
        return false;
    }

    /**
     * method to add a transition to the automaton
     * @param q1 start point of the transition
     * @param q2 end point of the transition
     * @param symbol symbol of the transition
     */
    public void makeTransition(String q1, String q2, Character symbol){
        try {
            // check if the states are in the automaton
            findState(q1);
            findState(q2);
            // check if the symbol is in the alphabet
            alphabet.contains(symbol);
            // check if the transition already exists
            for (Transition t: transitions) {
                if (t.Start.equals(q1) && t.End.equals(q2) && t.Symbol.equals(symbol)) {
                    throw new TransitionException("Transition already exists");
                }
            }
        } catch (StateException e) {
            System.out.println(e.getMessage());
        } catch (AlphabetException e) {
            System.out.println(e.getMessage());
        } catch (TransitionException e) {
            System.out.println(e.getMessage());
        }
        // if we get here, the transition is valid
        Transition transition = new Transition(q1, q2, symbol);
        transitions = Arrays.copyOf(transitions, transitions.length + 1);
        transitions[transitions.length - 1] = transition;
    }

    /**
     * method to find the current state
     * @param symbol the symbol to check
     */
    public String delta(Character symbol){
        //start at current state
        String state = current;
        //check if the symbol is in the alphabet
        try {
            alphabet.contains(symbol);
        } catch (AlphabetException e) {
            System.out.println(e.getMessage());
        }
        //if there is no transition, set the current state to null
        current = null;
        //run the automaton until it is in an accepting state or the current state is null
        while (!isAccepting() && current != null) {
            //check if there is a transition from the current state with the given symbol
            for (Transition t: transitions) {
                if (t.Start.equals(current) && t.Symbol.equals(symbol)) {
                    //if there is a transition, set the current state to the end state of the transition
                    current = t.End;
                    return current;
                }
            }
            //if there is no transition, set the current state to null
            current = null;
        }
        return current;
    }
}
