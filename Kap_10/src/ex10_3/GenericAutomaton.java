package ex10_3;

import java.util.Arrays;

public abstract class GenericAutomaton {
    protected State[] states;
    protected Transition[] transitions;
    protected Alphabet alphabet;
    protected String start;

    /**
     * constructor for GenericAutomaton
     */
    public GenericAutomaton(Alphabet alphabet) {
        this.states = new State[0];
        this.transitions = new Transition[0];
        this.alphabet = alphabet;
        this.start = "";
    }
    /**
     * abstract method to reset the automaton
     */
    abstract void reset();

    /**
     * abstract method to check the state of the automaton
     * @return
     */
    abstract boolean isAccepting();

    /**
     * method to add a state to the automaton
     */
    public void addState(State state, boolean isStart){
        try{
            // add state to states
            for (State s: states) {
                if (state.ID.equals(state.ID)) {
                    throw new StateException("Input State already exists in the Automaton");
                }
            }
        } catch (StateException e) {
            System.out.println(e.getMessage());
        }
        State[] newStates = new State[states.length + 1];
        System.arraycopy(states, 0, newStates, 0, states.length);
        newStates[states.length] = state;
        states = newStates;
        //set start the new state ID, if the user wants it
        if(isStart) {
            start = state.ID;
        }
    }

    /**
     * method to find a State by a given ID
     * @param id the id to search for
     * @return the searched state or null if the state is not found
     */
    public State findState(String id){
        for (State s: states) {
            if (s.ID.equals(id)) {
                return s;
            }
        }
        return  null;
    }

    /**
     * method to add a transition to the transition array
     *      1. if a state is not in the automaton throw StateDoesNotExistException
     *      2. if symbol is not in alphabet throw SymbolNotInAlphabetException
     * @param transition the transition to add
     */
    protected void addTransition(Transition transition){
        //check if transition state is not in the States of the automaton
        boolean containsA = false;
        boolean containsB = false;
        try {
            //check if the given states are in the array
            for (State s: states) {
                if(transition.Start == s.ID){
                    containsA = true;
                }
                if (transition.End == s.ID){
                    containsB = true;
                }
            }

            //check the states are in the Array
            if(containsA == false || containsB == false){
                throw new StateException("input State does not exist in Automaton \n" + "State Start exists: " + containsA + "\n" + "State End exists: " + containsB);
            }

            //check if letter of transition is in Alphabet
            boolean containsSymbol = false;
            for (Character c: alphabet.alphabet) {
                if(transition.Symbol == alphabet.alphabet[c]){
                    containsSymbol = true;
                }
            }
            //check if Symbol was in the Array
            if (containsSymbol = false){
                throw new AlphabetException("Alphabet does not contain the searched Symbol");
            }
        } catch (StateException e){
            System.out.println(e.getMessage());
        } catch (AlphabetException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        //if everything went smoothly add transition to transition array
        transitions = Arrays.copyOf(transitions, transitions.length + 1);
        transitions[transitions.length - 1] = transition;
    }
}
