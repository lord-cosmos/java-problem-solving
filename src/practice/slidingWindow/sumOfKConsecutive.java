package practice.slidingWindow;

import java.util.*;

public class sumOfKConsecutive {

  public static int sumOfKConsecutiveElements(int[] arr, int k) {
    // Sliding Window - using 1 pointer. this is somewhat unique.
    int max_sum = 0, current_sum = 0;
    for (int i = 0; i < k; i++) {
      current_sum += arr[i];
    }
    max_sum = current_sum;

    for (int i = k; i < arr.length; i++) {
      current_sum = (current_sum - arr[i - k] + arr[i]);

      max_sum = (current_sum > max_sum ? current_sum : max_sum);
    }
    return max_sum;

  }

  public static int sumOfKConsecutiveElements2(int[] arr, int k) {

    // Sliding window - using 2 pointers. this is normal.
    int sum = 0;
    int i = 0, j = 0;

    int max_sum = Integer.MIN_VALUE;
    while (j < arr.length) {
      sum += arr[j];

      if (j - i + 1 == k) {
        max_sum = Math.max(sum, max_sum);
        sum -= arr[i];
        i++;
        j++;
      } else {
        j++;
      }
    }
    return max_sum;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    System.out.println(sumOfKConsecutiveElements2(arr, 2));
  }
}
