package practice.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class sumOfKConsecutive {

  public static int sumOfKConsecutiveElements(int[] arr, int k) {
    // raw solution without sliding window :
    ArrayList<Integer> Sums = new ArrayList();
    int n = arr.length;
    for (int i = 0; i < n - k + 1; i++) {
      int sum = 0;
      for (int j = i; j < k + i; j++) {
        sum += arr[j];
      }
      Sums.add(sum);
    }

    int max = Arrays.stream(Sums.toArray()).max(null)
    return max;

  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    System.out.println(sumOfKConsecutiveElements(arr, 2));
  }
}
