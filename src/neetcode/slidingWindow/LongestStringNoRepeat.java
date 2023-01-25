package neetcode.slidingWindow;

import java.util.*;

public class LongestStringNoRepeat {

  public int lengthOfLongestSubstring2(String s) {
    Set<Character> set = new HashSet<>();
    int l = 0;
    int res = 0;

    for (int r = 0; r < s.length(); r++) {
      while (set.contains(s.charAt(r))) {
        set.remove(s.charAt(l));
        l += 1;
      }
      set.add(s.charAt(r));
      res = Math.max(res, r - l + 1);
    }
    return res;
  }

  public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int n = s.length();
    int maxLength = 0;
    int length = 0;
    int start = 0;
    int i = 0;

    while (i < n) {
      char currChar = s.charAt(i);
      if (!set.contains(currChar)) {
        set.add(currChar);
        length += 1;
        i++;
      } else {
        maxLength = Math.max(maxLength, length);
        i = start + 1;
        start = i;
        length = 0;
        // set.remove(currChar);
        set.removeAll(set);
      }
    }

    maxLength = Math.max(maxLength, length);

    return maxLength;
  }

  public static void main(String[] args) {
    LongestStringNoRepeat g = new LongestStringNoRepeat();
    System.out.println(g.lengthOfLongestSubstring2("abcabcbb"));
    System.out.println(g.lengthOfLongestSubstring2("bbbbb"));
    System.out.println(g.lengthOfLongestSubstring2("pwwkew"));
    System.out.println(g.lengthOfLongestSubstring2("dvdf"));
  }
}
