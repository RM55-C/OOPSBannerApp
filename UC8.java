/**
 * OOPSBannerApp UC8 – Advanced OOP Concepts Implementation
 *
 * This program prints the word "OOPS" in ASCII banner format
 * using HashMap to store character patterns.
 */

import java.util.HashMap;

public class UC8 {

    /**
     * Method to create and store character patterns in HashMapS
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        // Pattern for P
        charMap.put('P', new String[]{
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        });

        // Pattern for S
        charMap.put('S', new String[]{
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        });

        return charMap;
    }


    /**
     * Static method to display banner using character map
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }


    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}