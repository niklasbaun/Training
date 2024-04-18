public class ex4_6 {
    //a)
    private static int[] primesUpTo(int n){
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = i;
        }
        //remove 0 and 1
        numbers[0] = -1;
        numbers[1] = -1;

        //remove multiples of numbers not equal to -1
        for(int i = 2; i < n; i++){
            if(numbers[i] != -1){
                for(int j = 2 * i; j < n; j += i){
                    numbers[j] = -1;
                }
            }
        }

        //new array with only primes
        int count = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] != -1){
                count++;
            }
        }
        int[] primes = new int[count];
        count = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] != -1){
                primes[count] = numbers[i];
                count++;
            }
        }
        return primes;
    }

    //b)

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89};
        int[] primesToFifty = primesUpTo(50);
        for(int i = 0; i < primesToFifty.length; i++){
            if(primesToFifty[i] != primes[i]){
                System.out.println("primesUpTo(50) = " + primesToFifty[i] + " FAILED");
                System.out.println("Expected: " + primes[i]);
                return;
            } else {
                System.out.println("primesUpTo(50) = " + primesToFifty[i] + " PASSED");
            }
        }

        int[] primesToEighty = primesUpTo(80);
        for(int i = 0; i < primesToEighty.length; i++){
            if(primesToEighty[i] != primes[i]){
                System.out.println("primesUpTo(100) = " + primesToEighty[i] + " FAILED");
                System.out.println("Expected: " + primes[i]);
                return;
            } else {
                System.out.println("primesUpTo(100) = " + primesToEighty[i] + " PASSED");
            }
        }
    }
}
