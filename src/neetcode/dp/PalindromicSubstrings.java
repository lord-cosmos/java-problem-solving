package neetcode.dp;

class PalindromicSubstrings {
    public int countSubstrings(String s) {

        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right <= length - 1 && (s.charAt(left) == s.charAt(right))) {
                count += 1;
                left -= 1;
                right += 1;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right <= length - 1 && (s.charAt(left) == s.charAt(right))) {
                count += 1;
                left -= 1;
                right += 1;
            }
        }

        return count;
    }
}