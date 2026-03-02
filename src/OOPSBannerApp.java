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

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    String.join(" ", o[i], o[i], p[i], s[i])
            );
        }
    }
}