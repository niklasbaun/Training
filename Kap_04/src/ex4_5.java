public class ex4_5 {

    //TODO: noch nicht ganz klar

    
    private boolean isOnStick(byte stick, int pos){
        return (stick & (1 << pos)) == 0;
    }

    private boolean canMove(byte stick, int pos){
        for(int i = pos + 1; i < 8; i++){
            if(isOnStick(stick, i)){
                return false;
            }
        }
        return true;
    }

    private byte move(byte stick, int pos, boolean on){
        //check if we can move
        if(!canMove(stick, pos)){
            return stick;
        } else {
            if(on){
                //on  -> add ring
                return (byte) (stick | (1 << pos));
            } else {
                //off -> remove ring
                return (byte) (stick & ~(1 << pos));
            }
        }
    }

    /**
     * Print the stick
     * @param stick
     */
    private void printStick(byte stick){
        for(int i = 7; i >= 0; i--){
            if(isOnStick(stick, i)){
                System.out.print("X");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
    }

    /**
     * Solve the puzzle till pos
     * print after each step
     * @param stick the stick
     * @param pos the position until which to solve
     * @return the stick after solving
     */
    byte solve(byte stick, int pos){
        if(pos == 0){
            return stick;
        }
        //solve till pos - 1
        stick = solve(stick, pos - 1);
        //print stick
        printStick(stick);
        //move ring to pos
        stick = move(stick, pos, true);
        //print stick
        printStick(stick);
        //solve till pos - 1
        stick = solve(stick, pos - 1);
        //print stick
        printStick(stick);
        return stick;
    }

    byte unsolve(byte stick, int pos){
        return stick;
    }

    public static void main(String[] args) {
        ex4_5 ex = new ex4_5();
        byte stick = 0;
        ex.printStick(stick);
        stick = ex.solve(stick, 7);
        ex.printStick(stick);
    }
}

