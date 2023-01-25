package neetcode.ArraysAndHashing;

import java.util.HashMap;

public class twoSum {
  public int[] twoSums(int[] nums, int target) {
    // ArrayList<Integer> x = new ArrayList<>();
    // int[] x = new int[2];
    // for(int i =0; i < nums.length - 1 ; i++) {
    // for(int j=i+1; j < nums.length; j++){
    // if (nums[i] + nums[j] == target){
    // x[0] = i;
    // x[1] = j;
    // }
    // }
    // }
    // return x;

    // single pass solution

    // we find the diff, if it is there in hashmap, return the current index and
    // diff index in
    // that hashmap, else, add current val and index to hashmap.
    // simple.
    HashMap<Integer, Integer> prevMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];

      if (prevMap.containsKey(diff)) {
        return new int[] { prevMap.get(diff), i };
      }
      prevMap.put(nums[i], i);
    }
    return new int[] {};

  }
}
