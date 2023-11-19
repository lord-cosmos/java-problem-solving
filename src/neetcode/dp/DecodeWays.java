package neetcode.dp;

public class DecodeWays {

    int count = 0;
    public int numDecodings(String s) {
        return numDecodings(s, 0, new Integer[s.length()]);
    }

    private int numDecodings(String s, int i, Integer[] dp) {
        if (i == s.length())
            return 1;
        if (s.charAt(i) == '0')
            return 0;
        if (dp[i] != null)
            return dp[i];
        int count = 0;

        count = count + numDecodings(s, i + 1, dp);

        if (i < s.length() - 1 && (s.charAt(i) == '1' || s.charAt(i) == '2' &&
                s.charAt(i + 1) < '7')) {
            count = count + numDecodings(s, i + 2, dp);
        }
        dp[i] = count;
        return dp[i];
        // can pick 1 digit
        // cannot be zero
        // return 1 + numDecodings(s.substring(i+1, length+1))
        // return 0;
        // can pick 2 digit -> i can be atmost equal length-1;
        // cannot start with zero and [1,26]
        // return 1 + numDecodings(s.substring(i+2, length+1))
        // return 0;
    }
}