public class ex3_2 {
    //a)

    /**
     * iterative calculation of pi
     * @param n the number of iterations to approximate pi
     * @return the approximation of pi as double
     */
    private double piIterative(int n) {
        double pi = 0;
        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * pi;
    }
    //b)
    /**
     * recursive calculation of pi
     * @param n the number of iterations to approximate pi
     * @return the approximation of pi as double
     */
    private double piRecursive(int n) {
        if (n == 0) {
            return 4;
        } else {
            return 4 * (Math.pow(-1, n) / (2 * n + 1)) + piRecursive(n - 1);
        }
    }
    //c)

    /**
     * main method to test the pi calculation
     * @param args
     */
    public static void main(String[] args) {
        ex3_2 ex = new ex3_2();
        System.out.println(ex.piIterative(0));
        System.out.println(ex.piRecursive(0));

        System.out.println(ex.piIterative(20));
        System.out.println(ex.piRecursive(20));

        System.out.println(ex.piIterative(3));
        System.out.println(ex.piRecursive(3));
    }
}

