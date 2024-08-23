public class RabinKarp {
    public static void RabinKarpAlgo(String text, String pattern){
        int d = 10 ; int q = 13; 
        int p = 0; int t = 0; int h = 1;
        int n = text.length(); int m = pattern.length();
        
        // The value of h would be "pow(d, m-1) % q"
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate the hash value of the pattern and the first window of text
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (int i = 0; i <= n - m; i++) {
            // Check the hash values of the current window of text and pattern
            if (p == t) {
                // Check for characters one by one
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                // If the hash values match and all characters match
                if (match) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Calculate hash value for the next window of text
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                // Convert negative hash value to positive
                if (t < 0) {
                    t = (t + q);
                }
            }
        }
    }
    public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";
        RabinKarpAlgo(text, pattern);
    }
}
