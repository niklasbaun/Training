public class ex3_3 {
    //a)

    /**
     * recursive calculation of the k-th root of a number
     * @param a the number to calculate the root of
     * @param k the root
     * @param d the delta to stop the recursion
     * @return the k-th root of a
     */
    private double krt(double a, double k, double d){
        if(a < 0){
            return 0;
        }
        return krtH(a, k, d, a);
    }

    /**
     * helper method to calculate the k-th root of a number
     * @param a the number to calculate the root of
     * @param k the root
     * @param d the delta to stop the recursion
     * @param x_n the previous answer
     * @return the k-th root of a
     */

    private static double krtH(double a, double k, double d, double x_n) {
        double x_n1 = (1/k) * ((k - 1) * x_n + a / Math.pow(x_n, k - 1));
        if (Math.abs(x_n1 - x_n) < d) {
            return x_n;
        } else {
            return krtH(a, k, d, x_n1);
        }
    }

    public static void main(String[] args) {
        ex3_3 ex = new ex3_3();
        System.out.println(ex.krt(27, 3, 0.1));
        System.out.println(ex.krt(16, 4, 0.0001));
        System.out.println(ex.krt(2, 2, 0.0001));
        System.out.println(ex.krt(2, 3, 0.005));
        System.out.println(ex.krt(2, 4, 0.005));
        System.out.println(ex.krt(2, 5, 0.005));
        System.out.println(ex.krt(2, 6, 0.0001));
        System.out.println(ex.krt(2, 7, 0.0001));
        System.out.println(ex.krt(2, 8, 0.0001));
        System.out.println(ex.krt(2, 9, 0.0001));
        System.out.println(ex.krt(2, 10, 0.0001));
        System.out.println(ex.krt(2, 11, 0.0001));
        System.out.println(ex.krt(2, 12, 0.0001));
        System.out.println(ex.krt(2, 13, 0.1));
        System.out.println(ex.krt(2, 14, 0.1));
        System.out.println(ex.krt(2, 15, 0.1));
        System.out.println(ex.krt(2, 16, 0.0001));
        System.out.println(ex.krt(2, 17, 0.0001));
        System.out.println(ex.krt(2, 18, 0.0001));
        System.out.println(ex.krt(2, 19, 0.0001));
        System.out.println(ex.krt(2, 20, 0.0001));
    }
}

