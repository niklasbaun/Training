public class ex4_2 {
    //a)
    private String toBinary(int n) {
        if (n < 0) {
            return "Negative numbers are not supported";
        }
        if (n == 0) {
            return "0";
        } else {
            return toBinary(n / 2) + n % 2;
        }
    }

    //b)
    private String toOctal(int n) {
        if (n < 0) {
            return "Negative numbers are not supported";
        }
        if (n == 0) {
            return "0";
        } else {
            return toOctal(n / 8) + n % 8;
        }
    }

    //c)
    private String toTwosComplement(int n) {
        //vars used in the method
        String binary = "";
        String twosComplement = "";
        int i;
        String onesComplement = "";
        //check if number is in given value range
        if (n < -128 || n > 127) {
            System.out.println("Number is not in the given value range");
            return null;
        } else {
            //check if number is negative
            if (n == 0){
                return "00000000";
            } else if (n < 0) {
                //make positive
                n = n * -1;
                //convert to binary
                binary = toBinary(n);
                //check if number is 8 bit long
                if (binary.length() < 8) {
                    //add leading zeros
                    //find how many 0 need to be added
                    int x = 8 - binary.length();
                    for (i = 0; i < x; i++) {
                        binary = "0" + binary;
                    }
                }

                //invert the bits
                for (i = 0; i < binary.length(); i++) {
                    if (binary.charAt(i) == '0') {
                        onesComplement = onesComplement + "1";
                    } else {
                        onesComplement = onesComplement + "0";
                    }
                }
                //add 1 to the inverted bits, to create twos complement out of ones complement
                twosComplement = onesComplement;
                for (i = 7; i >= 0; i--) {
                    if (onesComplement.charAt(i) == '1') {
                        twosComplement = twosComplement.substring(0, i) + '0' + twosComplement.substring(i + 1);
                    } else {
                        twosComplement = twosComplement.substring(0, i) + '1' + twosComplement.substring(i + 1);
                        break;
                    }
                }
                //return the twos complement
                return twosComplement;


            } else {
                //if number is positive, convert to binary
                binary = toBinary(n);
                //check if number is 8 bit long
                if (binary.length() < 8) {
                    //add leading zeros
                    //find how many 0 need to be added
                    int x = 8 - binary.length();
                    for (i = 0; i < x; i++) {
                        binary = "0" + binary;
                    }
                }
                //binary is the same as ones complement
                twosComplement = binary;
                //return the twos complement
                return twosComplement;
            }
        }
    }

    public void my_tests(){
        //test toBinary
        String binT1 = "0";
        String binT1Res = toBinary(0);
        if(binT1.equals(binT1Res)){
            System.out.println("toBinary(0) = " + binT1Res + " PASSED");
        } else {
            System.out.println("toBinary(0) = " + binT1Res + " FAILED");
            System.out.println("Expected: " + binT1);
        }
        String binT2 = "1";
        String binT2Res = toBinary(1);
        if(binT2.equals(binT2Res)){
            System.out.println("toBinary(1) = " + binT2Res + " PASSED");
        } else {
            System.out.println("toBinary(1) = " + binT2Res + " FAILED");
            System.out.println("Expected: " + binT2);
        }
        String binT3 = "Negative numbers are not supported";
        String binT3Res = toBinary(-1);
        if(binT3.equals(binT3Res)){
            System.out.println("toBinary(-1) = " + binT3Res + " PASSED");
        } else {
            System.out.println("toBinary(-1) = " + binT3Res + " FAILED");
            System.out.println("Expected: " + binT3);
        }

        //test toOctal
        String octT1 = "0";
        String octT1Res = toOctal(0);
        if(octT1.equals(octT1Res)){
            System.out.println("toOctal(0) = " + octT1Res + " PASSED");
        } else {
            System.out.println("toOctal(0) = " + octT1Res + " FAILED");
            System.out.println("Expected: " + octT1);
        }
        String octT2 = "1";
        String octT2Res = toOctal(1);
        if(octT2.equals(octT2Res)){
            System.out.println("toOctal(1) = " + octT2Res + " PASSED");
        } else {
            System.out.println("toOctal(1) = " + octT2Res + " FAILED");
            System.out.println("Expected: " + octT2);
        }
        String octT3 = "Negative numbers are not supported";
        String octT3Res = toOctal(-1);
        if(octT3.equals(octT3Res)){
            System.out.println("toOctal(-1) = " + octT3Res + " PASSED");
        } else {
            System.out.println("toOctal(-1) = " + octT3Res + " FAILED");
            System.out.println("Expected: " + octT3);
        }

        //test toTwosComplement
        String twosT1 = "00000000";
        String twosT1Res = toTwosComplement(0);
        if(twosT1.equals(twosT1Res)){
            System.out.println("toTwosComplement(0) = " + twosT1Res + " PASSED");
        } else {
            System.out.println("toTwosComplement(0) = " + twosT1Res + " FAILED");
            System.out.println("Expected: " + twosT1);
        }
        String twosT2 = "00000001";
        String twosT2Res = toTwosComplement(1);
        if(twosT2.equals(twosT2Res)){
            System.out.println("toTwosComplement(1) = " + twosT2Res + " PASSED");
        } else {
            System.out.println("toTwosComplement(1) = " + twosT2Res + " FAILED");
            System.out.println("Expected: " + twosT2);
        }
        String twosT3 = "11111111";
        String twosT3Res = toTwosComplement(-1);
        if(twosT3.equals(twosT3Res)){
            System.out.println("toTwosComplement(-1) = " + twosT3Res + " PASSED");
        } else {
            System.out.println("toTwosComplement(-1) = " + twosT3Res + " FAILED");
            System.out.println("Expected: " + twosT3);
        }
    }

    public static void main(String[] args) {
        ex4_2 ex = new ex4_2();
        ex.my_tests();
    }
}

