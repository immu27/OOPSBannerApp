/**
 * OOPSBannerApp
 * UC7: Store Character Pattern in an Inner Static Class
 *
 * @author Immanuel
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate character and pattern
     */
    public static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character to represent
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
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

    // Utility Methods

    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        // Create objects for O, P, S
        CharacterPattern oPattern = new CharacterPattern('O', getOPattern());
        CharacterPattern pPattern = new CharacterPattern('P', getPPattern());
        CharacterPattern sPattern = new CharacterPattern('S', getSPattern());

        CharacterPattern[] word = {
                oPattern,
                oPattern,
                pPattern,
                sPattern
        };

        // Print banner using StringBuilder
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}