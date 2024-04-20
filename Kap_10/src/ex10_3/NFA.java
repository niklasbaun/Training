package ex10_3;



public class NFA extends GenericAutomaton {
    String current;
    static final char EPSILON = 'ε';

public NFA(Alphabet alphabet) {
        super(alphabet);
    }


    @Override
    void reset() {
        current = start;
    }

    @Override
    boolean isAccepting() {
        for (State s: states) {
            if (s.ID.equals(current)) {
                return s.accepting;
            }
        }
        return false;
    }

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
    }

    public String delta(Character symbol){
        String state = current;
        alphabet.contains(symbol);

        //check if the current state has a transition with the given symbol or epsilon
        for (Transition t: transitions) {
            if (t.Start.equals(current) && (t.Symbol.equals(symbol) || t.Symbol.equals(EPSILON))) {
                current = t.End;
                return current;
            }
        }

        current = null;
        return current;
    }
}
