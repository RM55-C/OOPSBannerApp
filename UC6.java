public class UC6 {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // O Pattern (9 rows)
    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    // P Pattern (9 rows)
    public static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // S Pattern (9 rows)
    public static String[] getSPattern() {
        return new String[]{
                " ******  ",
                "**       ",
                "**       ",
                "**       ",
                " ******  ",
                "      ** ",
                "      ** ",
                "      ** ",
                " ******  "
        };
    }
}