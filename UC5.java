/**
 * 00PSBannerApp UC5
 * Render OOPS as Banner using Inline Array Initialization
 * Exact Output Match
 */

public class UC5 {

    public static void main(String[] args) {

        String[] lines = {

            String.join("   ",
                "   ***   ",
                "   ***   ",
                " ******  ",
                " *****   "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **      "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **      "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " *****   "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " **      ",
                "     **  "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " **      ",
                "     **  "),

            String.join("   ",
                " **   ** ",
                " **   ** ",
                " **      ",
                "     **  "),

            String.join("   ",
                "   ***   ",
                "   ***   ",
                " **      ",
                " *****   ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}