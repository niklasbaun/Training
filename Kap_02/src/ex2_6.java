public class ex2_6 {
    //a)

    /**
     * helper method to check if a number is between two other numbers
     * @param value the number to check
     * @param lower the lower bound
     * @param upper the upper bound
     * @return true if the number is between the bounds, false otherwise
     */
    private boolean isBetween(int value, int lower, int upper) {
        return value >= lower && value <= upper;
    }

    //b)
    private int postage(int length, int width, int height, int weight) {
        if (isBetween(length, 140, 235) && isBetween(width, 90, 125) && isBetween(height, 0, 2) && isBetween(weight, 0, 15)) {
            return 70;
        } else if (isBetween(length, 140, 235) && isBetween(width, 90, 125) && isBetween(height, 0, 5) && isBetween(weight, 0, 20)) {
            return 85;
        } else if (isBetween(length, 100, 235) && isBetween(width, 70, 125) && isBetween(height, 0, 10) && isBetween(weight, 0, 50)) {
            return 100;
        } else if (isBetween(length, 100, 353) && isBetween(width, 70, 250) && isBetween(height, 0, 20) && isBetween(weight, 0, 500)) {
            return 150;
        } else if (isBetween(length, 100, 353) && isBetween(width, 70, 250) && isBetween(height, 0, 50) && isBetween(weight, 0, 1000)) {
            return 275;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ex2_6 ex = new ex2_6();
        System.out.println(ex.postage(140, 90, 1, 10));
        System.out.println(ex.postage(140, 90, 1, 20));
        System.out.println(ex.postage(140, 90, 1, 50));
        System.out.println(ex.postage(140, 90, 1, 100));
        System.out.println(ex.postage(140, 90, 1, 1000));
        System.out.println(ex.postage(140, 90, 1, 1200));
    }

}

