package recursion;

import java.util.ArrayList;

public class SortArray {

  public ArrayList<Integer> insertAt(ArrayList<Integer> arr, int val) {
    int len = arr.size();
    if ((len == 0) || arr.get(len - 1) <= val) {
      arr.add(len - 1, val);
    }
    int last = arr.get(len - 1);
    arr.remove(len - 1);
    insertAt(arr, val);
    arr.add(len - 1, last);
    return arr;
  }

  public ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
    if (arr.size() == 1)
      return arr;

    int lastIndex = arr.size() - 1;
    int last = arr.get(lastIndex);
    arr.remove(lastIndex);

    ArrayList<Integer> temp = sortArray(arr);
    ArrayList<Integer> sorted = insertAt(temp, last);
    return sorted;
  }
}
