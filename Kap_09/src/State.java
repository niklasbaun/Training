public class State {
    String ID;
    boolean accepting;

    /**
     * Constructor for State
     * @param ID is the "name" of the state
     * @param accepting is whether it is an accepted end state.
     */
    public State(String ID, boolean accepting) {
        this.ID = ID;
        this.accepting = accepting;
    }
}
