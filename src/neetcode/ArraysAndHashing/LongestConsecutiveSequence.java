package neetcode.ArraysAndHashing;

import java.util.*;

public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0)
      return 0;
    Set<Integer> set = new HashSet<>();
    for (int i : nums) {
      set.add(i);
    }
    int ans = 1;
    for (int num : nums) {
      if (!set.contains(num - 1)) {
        int count = 1;
        while (set.contains(num + 1)) {
          num++;
          count++;
        }
        ans = Math.max(count, ans);
      }
    }
    return ans;

  }
}
