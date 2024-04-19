public class ex8_1 {
    /**
     * method to find a substring in source which matches the search String and replace it with the replace String
     * @param source the String to search in
     * @param search the String to search for
     * @param replace the String to replace the search String with
     * @return the source String with the search String replaced with the replace String
     */
    public static String replace(String source, String search, String replace) {
        //check whether the search string is even in the source string
        int index = source.indexOf(search);
        //if not return the source string
        if (index == -1) {
            return source;
        }
       /* //look if search string 1st char is lower or upper case
        boolean isLowerCase = Character.isLowerCase(search.charAt(0));
        //if it is lower case also  create search word with upper case 1st char
        String searchOtherCase = "";
        if (isLowerCase) {
            searchOtherCase = Character.toUpperCase(search.charAt(0)) + search.substring(1);
        }else {
            searchOtherCase = Character.toLowerCase(search.charAt(0)) + search.substring(1);
        }*/

        //if there is then loop until all occurences are replaced
        while (index != -1) {
            //add the part of the source string before the search string to the result string and the replace string after it
            source = source.substring(0, index) + replace + source.substring(index + search.length());
            //look for the next occurence of the search string
            index = source.indexOf(search, index + replace.length());
        }
        return source;
    }
}
