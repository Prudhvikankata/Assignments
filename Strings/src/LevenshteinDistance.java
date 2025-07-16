public class LevenshteinDistance {
    public static void main(String[] args) {
        String s1 = "flaw";
        String s2 = "lawn";

        int distance = computeLevenshteinDistance(s1, s2);
        System.out.println("Levenshtein Distance: " + distance);
    }

    static int computeLevenshteinDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) dp[i][0] = i;
        for (int j = 0; j <= n; j++) dp[0][j] = j;

        // Fill in the matrix using the Levenshtein formula
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(Math.min(
                                dp[i - 1][j] + 1,      // deletion
                                dp[i][j - 1] + 1),     // insertion
                        dp[i - 1][j - 1] + cost // substitution
                );
            }
        }

        return dp[m][n];
    }
}
