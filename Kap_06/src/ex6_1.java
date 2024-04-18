public class ex6_1 {
    /**
     * method to look if one string is the reverse of another
     * @param s1 1st string
     * @param s2 2nd string
     * @return true if s1 is the reverse of s2; false if not
     */
    public static boolean isReverse(String s1, String s2) {
        //make all lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //remove spaces and punctuation
        s1 = s1.replaceAll("\\s+", "");
        s2 = s2.replaceAll("\\s+", "");
        s1 = s1.replaceAll("\\p{Punct}", "");
        s2 = s2.replaceAll("\\p{Punct}", "");

        //check if the words are the same length
        if (s1.length() != s2.length()) {
            return false;
        }
        //counter for the loop
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(s2.length() - 1 - i)) {
                count++;
            }
        }
        return count == s1.length();
    }
}
