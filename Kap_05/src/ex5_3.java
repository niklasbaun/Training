public class ex5_3 {
    public static void main(String[] args) {
        //for testing
        //measures the time it takes to run the method for different values
        //n = 0
        measureAndTest(0);
        //n = 1
        measureAndTest(1);
        //n = 5
        measureAndTest(5);
        //n = 10
        measureAndTest(10);
        //n = 30
        measureAndTest(30);
        //n = 42
        measureAndTest(42);
        //n = 50
        measureAndTest(50);
        //n = 64
        measureAndTest(64);
    }

    /**
     * method to calculate the fibonacci number of a given number recursively
     * @param n the number
     * @return the fibonacci number
     */
    public static int fiboTree(int n){
        if (n < 0){
            System.out.println("n must be greater than 0");
            return -1;
        } else if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fiboTree(n - 1) + fiboTree(n - 2);
        }
    }

    /**
     * method to calculate the fibonacci number of a given number tail recursive
     * @param n the number
     * @return the fibonacci number
     */
    public static int fiboFast(int n){
        if (n < 0){
            System.out.println("n must be greater than 0");
            return -1;
        }
        return fiboHelp(n, 0, 1);
    }

    /**
     * helper method to calculate the fibonacci number of a given number tail recursive
     * @param n the number
     * @param a the first number
     * @param b the second number
     * @return the fibonacci number
     */
    private static int fiboHelp(int n, int a, int b){
        if (n == 0){
            return a;
        } else {
            // call method again with n-1, b and a+b
            return fiboHelp(n-1, b, a+b);
        }
    }

    /**
     * method to measure the time needed to calculate the fibonacci number
     *        - with the fiboTree method
     *        - with the fiboFast method
     * @param n the number of the fibonacci number
     */

    public static void measureAndTest(int n){
        //measure fiboTree
        long start = System.nanoTime();
        int fiboTree = fiboTree(n);
        long end = System.nanoTime();
        //print result
        System.out.println("fiboTree for " + n + " : "  + fiboTree + " in " + (float)(end-start)/1000000 + "ms");
        // measure fiboFast
        start = System.nanoTime();
        int fiboFast = fiboFast(n);
        end = System.nanoTime();
        //print result
        System.out.println("fiboFast for "+ n + " : "  + fiboFast + " in " + (float)(end-start)/1000000 + "ms");
        if (fiboFast == fiboTree){
            System.out.println("fiboFast and fiboHelp for "+ n + " is for both: " + fiboFast);
        } else {
            System.out.println("fiboFast for "+ n +"is: " + fiboFast);
            System.out.println("fiboTree for "+ n +"is: " + fiboTree);
        }

    }
}
