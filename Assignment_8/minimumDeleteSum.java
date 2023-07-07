// Ques 1 : Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal

class Solution {

    public int deleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store the minimum ASCII sum
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the first row and column
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        // Fill the remaining cells of the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters are equal, no deletion needed
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Delete either from s1 or s2 and choose the minimum
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }

        return dp[m][n];
    }

    public int minimumDeleteSum(String s1, String s2) {
        return deleteSum(s1, s2);
    }
}
// note : submitted on leetcode platform.