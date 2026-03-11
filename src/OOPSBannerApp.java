import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Use Map for Character Patterns and Render via Function
 * 
 * @author Immanuel
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Method to create the character pattern map
     * @return map of character patterns
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        patterns.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        patterns.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return patterns;
    }

    /**
     * Method to render banner text
     * @param message banner message
     * @param patterns character pattern map
     */
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patterns = createCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}