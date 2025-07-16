public class RabinKarpSearch {
    public static void main(String[] args) {
        String text = "HELLOTHISISJAVA";
        String pattern = "THIS";
        int prime = 101;

        rabinKarp(text, pattern, prime);
    }

    static void rabinKarp(String text, String pattern, int prime) {
        int m = pattern.length();
        int n = text.length();
        int pHash = 0, tHash = 0, h = 1;
        int d = 256; // Number of characters in input alphabet (ASCII)

        // The value of h would be "pow(d, m-1) % prime"
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % prime;

        // Calculate hash value for pattern and first window of text
        for (int i = 0; i < m; i++) {
            pHash = (d * pHash + pattern.charAt(i)) % prime;
            tHash = (d * tHash + text.charAt(i)) % prime;
        }

        // Slide the pattern over text one by one
        for (int i = 0; i <= n - m; i++) {
            // If the hash values match, check characters one by one
            if (pHash == tHash) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text
            if (i < n - m) {
                tHash = (d * (tHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;

                // Make sure hash is positive
                if (tHash < 0)
                    tHash += prime;
            }
        }
    }
}
