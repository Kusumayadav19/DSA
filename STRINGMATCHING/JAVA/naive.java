// Naive String Matching Algorithm - A brute force Approach
import java.util.*;

public class naive{

    public static List<Integer> NaiveStringAlgo(String text, String pattern) {

        List<Integer> result = new ArrayList<>();
        int n = text.length();  // textLength 
        int m = pattern.length(); // patternlength

        for (int i = 0; i <= n -m; i++) {
            int j = 0;
            while(j < m && pattern.charAt(j) == text.charAt(i+j)){
                j += 1;
            }

            if (j == m) {
                result.add(i); 
            }
        }
    return result;
    }

    public static void main(String[] args) {
        String text = "THIS IS A TEST TEXT FOR YOU PROGRAM TO TEST";
        String pattern = "TEST";

        List<Integer> indices = NaiveStringAlgo(text, pattern);

        for (int index : indices) {
            System.out.println("Pattern found at index " + index);
        }
    }
}