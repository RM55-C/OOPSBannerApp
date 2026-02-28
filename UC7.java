public class UC7 {

    /**
     * Static Inner Class that encapsulates
     * a character and its banner pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character the character
         * @param pattern 9-line ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and returns all supported character pattern mappings.
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ******  ",
                "**       ",
                "**       ",
                "**       ",
                " ******  ",
                "      ** ",
                "      ** ",
                "      ** ",
                " ******  "
        });

        return new CharacterPatternMap[]{oPattern, pPattern, sPattern};
    }

    /**
     * Returns pattern for given character.
     * @param ch character to search
     * @param charMaps array of pattern maps
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return null; // if character not found
    }

    /**
     * Prints the message in banner format.
     * @param message text to print
     * @param charMaps character pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 9;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Entry point
     * Initializes mappings and prints "OOPS"
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}