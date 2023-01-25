package neetcode.LinkedList;

import java.util.ArrayList;

import neetcode.LinkedList.MergeTwoSortedLists;

public class MergeKSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }

    while (lists.length > 1) {
      // ArrayList<ListNode> mergedList = new ArrayList<>();

      for (int i = 0; i < lists.length; i += 2) {
        ListNode list1 = lists[i];
        ListNode list2 = (i + 1 < lists.length ? lists[i + 1] : null);
        lists[i] = (MergeTwoSortedLists.mergeTwoLists(list1, list2));
      }
      return lists[0];
    }
  }
}
