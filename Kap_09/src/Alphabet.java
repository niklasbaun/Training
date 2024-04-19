public class Alphabet {
    Character[] alphabet;

    /**
     * Constructor for Alphabet
     * @param alphabet is a Character[] containing all symbols in the alphabet.
     */
    public Alphabet(Character[] alphabet) {
        this.alphabet = alphabet;
    }

    /**
     * check if a character is in the alphabet
     * @param c the character to check
     * @return boolean true if char is in alphabet, Exception if not
     */
    public boolean contains(Character c) throws AlphabetException {
        for (Character character : alphabet) {
            if (character.equals(c)) {
                return true;
            }
        }
        // if we get here, the character is not in the alphabet
        //throw exception Symbol not in Alphabet
        throw new AlphabetException("Input not in the valid Alphabet");
    }
}
