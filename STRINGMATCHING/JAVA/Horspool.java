package DSA.STRINGMATCHING.JAVA;

import java.util.Arrays;

public class Horspool {

    // Method to create the shift table
    public static int[] shiftTable(String pattern) {
        int m = pattern.length();
        int[] table = new int[26]; 

        Arrays.fill(table, m);

        for (int i = 0; i < m - 1; i++) {
            table[pattern.charAt(i) - 'A'] = m - 1 - i;
        }

        return table;
    }

    public static int horspool(String text, String pattern, int[] table) {
        int n = text.length();
        int m = pattern.length();
        int i = m - 1;

        while (i <= n - 1) {
            int k = 0;
            while (k < m && pattern.charAt(m - 1 - k) == text.charAt(i - k)) {
                k++;
            }

            if (k == m) {
                return i - m + 1;
            } else {
                i += table[text.charAt(i) - 'A'];
            }
        }

    return -1;
    }

    public static void main(String[] args) {
        String text = "GTACTATGTA";
        String pattern = "ATGTA";
        int[] table = shiftTable(pattern);

        System.out.print("Shift Table: " + Arrays.toString(table));
        System.out.println();

        int index = horspool(text, pattern, table);
        System.out.println("Pattern found at index: " + index);
    }
}