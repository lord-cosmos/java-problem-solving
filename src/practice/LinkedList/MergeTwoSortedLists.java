package practice.LinkedList;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class MergeTwoSortedLists {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode p1 = list1;
    ListNode p2 = list2;

    ListNode dummy = new ListNode(10000000);
    ListNode pointerOnDummy = dummy;

    while (true) {
      if (list1 == null) {
        pointerOnDummy.next = list2;
        break;
      }
      if (list2 == null) {
        pointerOnDummy.next = list1;
        break;
      }

      if (p1.val <= p2.val) {
        pointerOnDummy.next = p1;
        p1 = p1.next;
      } else {
        pointerOnDummy.next = p2;
        p2 = p2.next;
      }

      pointerOnDummy = pointerOnDummy.next;

    }
    return dummy.next;

  }
}
