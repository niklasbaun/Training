package ex5_2;

public class Playfair {
    private final char[][] playfairSquare ;
    private final String Alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    /**
     * constructor of playfairSquare
     * @param codeword string
     * @return playfairSquare
     */
    public Playfair(String codeword) {
        String codewordUpper = toUpperCase(codeword);
        String sNoJ = "";
        String sClean = "";
        //format to the rules
        //remove J
        for(int i=0; i<codewordUpper.length(); i++){
            if(codewordUpper.charAt(i) == 'J'){
                continue;
            }
            sNoJ = sNoJ + codewordUpper.charAt(i);
        }
        //remove duplicates
        for (int i = 0; i < sNoJ.length(); i++) {
            if(!sClean.contains(String.valueOf(sNoJ.charAt(i)))) {
                sClean += String.valueOf(sNoJ.charAt(i));
            }
        }
        //add rest of Alphabet to the end
        for(int i=0; i<Alphabet.length(); i++) {
            if(characterInString( sClean, Alphabet.charAt(i) ) == false) {
                sClean = sClean + Alphabet.charAt(i);
            }
        }
        char[][] playfairSquareTemp = new char[5][5];
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                playfairSquareTemp[i][j] = sClean.charAt(5*i+j);
            }
        }
        this.playfairSquare = playfairSquareTemp;
    }

    /**
     * method to print the playfair square as a formatted String
     * @return the formatted String
     */
    public String printSquare() {
        String square = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square = square + playfairSquare[i][j] + " ";
            }
            square = square + " ";
        }
        return square;
    }

    /**
     * method to find the position of a character in the square
     * @param c the char
     * @return the position of the character
     */
    private Position findInSquare(char c){
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(playfairSquare[i][j] == c) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    /**
     *removeCharacter produces a copy of a String with all appearances of the Character c removed.
     *@param codeword is the String we are looking through.
     *@param c is the Character we are looking for.
     *@return the new String without c.
     */
    private String removeCharacter(final String codeword, final Character c) {
        String result = "";
        for(int i = 0; i < codeword.length(); i++) {
            if(codeword.charAt(i) != c) {
                result += codeword.charAt(i);
            }
        }
        return result;
    }

    /**
     *removeSpecial turns all letters in a word to uppercase and then removes all the special Characters.
     *for our purpose 'J' is considered a special Character, so it is removed as well.
     *@param word is the String we want to cleanse of special Characters and 'J'.
     *@return word but uppercase and without special Characters or 'J'
     */
    private String removeSpecial(final String word) {
        String result = word.toUpperCase();
        Character c;
        for(int i = 0; i < word.length();i++) {
            c = word.charAt(i);
            //alternative regex solution: result = result.replaceAll("[^A-Za-z]", "");
            if(c < 'A' || c > 'Z' || c == 'J')
                result = removeCharacter(result, c);
        }
        return result;
    }

    /**
     *cleanWord first uses removeSpecial on word and then does the following:
     *	"Das zu übersetzende Wort wird zunächst von Leerzeichen und Sonderzeichen bereinigt und dann
     *	in Buchstabenpaare aufgeteilt. Taucht in einem solchen Paar ein Buchstabe zwei Mal auf, wird
     *	ein X zwischen beide Buchstaben geschoben und der doppelte Buchstabe wird in das nächste
     *	Paar übernommen. Wenn das letzte Paar nur einen Buchstaben enthält, wird einfach ein A an das
     *	Wort angehängt. Beispielsweise würde MITTWOCH zu MI TX TW OC HA, aber OTTO könnte
     *	zu OT TO werden"
     *words in witch the last pair was just "A" posed an added challenge since the
     *method described in 6.2 would make it "AA", which by itself cannot be unambiguously
     *encoded since it fits rule 1 and 2. If we then split the "AA" into "AX A" we just have
     *the same problem again.
     *So I decided "A" just becomes "AX".
     *@param word is the String we want to transform via the rules above.
     *@return is a String that can be split into pairs of two different Characters.
     */
    private String cleanWord(final String word) {
        String clean = removeSpecial(word);
        String result = "";
        Character nextOrA;
        for(int i = 0; i < clean.length(); i += 2) {
            if(i == clean.length() - 1) {
                nextOrA = 'A';
            }
            else {
                nextOrA = clean.charAt(i + 1);
            }
            if((clean.charAt(i) == nextOrA)) {
                result = result + clean.charAt(i) + 'X';
                i -= 1;
            }
            else {
                result = result + clean.charAt(i) + nextOrA;
            }
        }
        return result;
    }

    /**
     * method to encrypt a string with the playfair rules
     *             - if the string is empty, return null
     *             - if the string is not empty, return the encrypted string
     * @param word the string
     * @return the encrypted string
     */
    public String encode(String word){
        if (word.length() == 0){
            return null;
        }
        String sClean = cleanWord(word);
        String sEncrypted = "";
        //encrypt the word
        for(int i=0; i < sClean.length()-1; i+=2){
            Position pos1 = this.findInSquare(sClean.charAt(i));
            Position pos2 = this.findInSquare(sClean.charAt(i + 1));
            //if both are in the same row
            if (pos1.getX() == pos2.getX()) {
                sEncrypted = sEncrypted + playfairSquare[pos1.getX()][(pos1.getY() + 1) % 5] + playfairSquare[pos2.getX()][(pos2.getY() + 1) % 5];
            }
            //of both are in the same column
            else if (pos1.getY() == pos2.getY()) {
                sEncrypted = sEncrypted + playfairSquare[(pos1.getX() + 1) % 5][pos1.getY()] + playfairSquare[(pos2.getX() + 1) % 5][pos2.getY()];
            } else {
                sEncrypted = sEncrypted + playfairSquare[pos1.getX()][pos2.getY()] + playfairSquare[pos2.getX()][pos1.getY()];
            }
        }
        return sEncrypted;
    }

    /**
     * method to look if a given character is in a string
     * @param s
     * @param character
     * @return true if the character is in the string, false if not
     */
    private boolean characterInString(String s, Character character) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

    /**
     * method to convert a string to uppercase
     * @param s string to convert
     * @return the string in uppercase
     */
    private String toUpperCase(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += Character.toUpperCase(s.charAt(i));
        }
        return newString;
    }
}
