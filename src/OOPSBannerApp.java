/**
 * OOPSBannerApp
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * @author Immanuel
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] p = {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };

        String[] s = {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };

        // Step 1: Create banner array
        String[] banner = new String[7];

        // Step 2: Populate array using String.join()
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Step 3: Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}