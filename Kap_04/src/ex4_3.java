public class ex4_3 {
    public void testAll(){
        float[] testArray1 = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        float[] testArray2 = {5.0f, 4.0f, 3.0f, 2.0f, 1.0f};
        float[] testArray3 = {1.0f, 3.0f, 2.0f, 4.0f, 5.0f};

        //test getMin
        float Min = 1.0f;
        float MinRes1 = getMin(testArray1);
        if(Min == MinRes1){
            System.out.println("getMin(testArray1) = " + MinRes1 + " PASSED");
        } else {
            System.out.println("getMin(testArray1) = " + MinRes1 + " FAILED");
            System.out.println("Expected: " + Min);
        }
        float MinRes2 = getMin(testArray2);
        if(Min == MinRes2){
            System.out.println("getMin(testArray2) = " + MinRes2 + " PASSED");
        } else {
            System.out.println("getMin(testArray2) = " + MinRes2 + " FAILED");
            System.out.println("Expected: " + Min);
        }
        float MinRes3 = getMin(testArray3);
        if(Min == MinRes3){
            System.out.println("getMin(testArray3) = " + MinRes3 + " PASSED");
        } else {
            System.out.println("getMin(testArray3) = " + MinRes3 + " FAILED");
            System.out.println("Expected: " + Min);
        }

        //test getMax
        float Max = 5.0f;
        float MaxRes1 = getMax(testArray1);
        if(Max == MaxRes1){
            System.out.println("getMax(testArray1) = " + MaxRes1 + " PASSED");
        } else {
            System.out.println("getMax(testArray1) = " + MaxRes1 + " FAILED");
            System.out.println("Expected: " + Max);
        }
        float MaxRes2 = getMax(testArray2);
        if(Max == MaxRes2){
            System.out.println("getMax(testArray2) = " + MaxRes2 + " PASSED");
        } else {
            System.out.println("getMax(testArray2) = " + MaxRes2 + " FAILED");
            System.out.println("Expected: " + Max);
        }
        float MaxRes3 = getMax(testArray3);
        if(Max == MaxRes3){
            System.out.println("getMax(testArray3) = " + MaxRes3 + " PASSED");
        } else {
            System.out.println("getMax(testArray3) = " + MaxRes3 + " FAILED");
            System.out.println("Expected: " + Max);
        }

        //test calcAvg
        float Avg = 3.0f;
        float AvgRes1 = calcAvg(testArray1);
        if(Avg == AvgRes1){
            System.out.println("calcAvg(testArray1) = " + AvgRes1 + " PASSED");
        } else {
            System.out.println("calcAvg(testArray1) = " + AvgRes1 + " FAILED");
            System.out.println("Expected: " + Avg);
        }
        float AvgRes2 = calcAvg(testArray2);
        if(Avg == AvgRes2){
            System.out.println("calcAvg(testArray2) = " + AvgRes2 + " PASSED");
        } else {
            System.out.println("calcAvg(testArray2) = " + AvgRes2 + " FAILED");
            System.out.println("Expected: " + Avg);
        }
        float AvgRes3 = calcAvg(testArray3);
        if(Avg == AvgRes3){
            System.out.println("calcAvg(testArray3) = " + AvgRes3 + " PASSED");
        } else {
            System.out.println("calcAvg(testArray3) = " + AvgRes3 + " FAILED");
            System.out.println("Expected: " + Avg);
        }

        //test isSorted
        boolean isSortedRes1 = isSorted(testArray1);
        if(isSortedRes1){
            System.out.println("isSorted(testArray1) = " + isSortedRes1 + " PASSED");
        } else {
            System.out.println("isSorted(testArray1) = " + isSortedRes1 + " FAILED");
            System.out.println("Expected: " + false);
        }
        boolean isSortedRes2 = isSorted(testArray2);
        if(isSortedRes2){
            System.out.println("isSorted(testArray2) = " + isSortedRes2 + " PASSED");
        } else {
            System.out.println("isSorted(testArray2) = " + isSortedRes2 + " FAILED");
            System.out.println("Expected: " + false);
        }
        boolean isSortedRes3 = isSorted(testArray3);
        if(!isSortedRes3){
            System.out.println("isSorted(testArray3) = " + isSortedRes3 + " PASSED");
        } else {
            System.out.println("isSorted(testArray3) = " + isSortedRes3 + " FAILED");
            System.out.println("Expected: " + true);
        }
    }

    private float getMin(float[] array){
        float min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    private float getMax(float[] array){
        float max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    private float calcAvg(float[] array){
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    private boolean isSorted(float[] array){
        if(array.length == 0 || array.length == 1){
            return true;
        }
        if(array[0] > array[array.length - 1]){
            //descending?
            for(int i = 1; i < array.length; i++){
                if(array[i] > array[i - 1]){
                    return false;
                }
            }
            return true;
        } else {
            //ascending?
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ex4_3 ex = new ex4_3();
        ex.testAll();
    }
}

