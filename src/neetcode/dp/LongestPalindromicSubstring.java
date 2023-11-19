package neetcode.dp;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String res = "";
        int res_length = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {

            // for odd length strings
            int left = i;
            int right = i;

            while (left >= 0 && right <= len - 1 && (s.charAt(left) == s.charAt(right))) {
                if (right - left + 1 > res_length) {
                    res_length = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                left -= 1;
                right += 1;

            }

            // for even length strings
            left = i;
            right = i + 1;

            while (left >= 0 && right <= len - 1 && (s.charAt(left) == s.charAt(right))) {
                if (right - left + 1 > res_length) {
                    res_length = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                left -= 1;
                right += 1;

            }

        }
        return res;

    }
}
