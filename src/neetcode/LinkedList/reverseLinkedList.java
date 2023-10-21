package neetcode.LinkedList;

//  * Definition for singly-linked list.


public class reverseLinkedList {

  // Iterative version
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  // Recursive Version : we do the same like above, instead of loop, we recurse.
  public ListNode reverseList2(ListNode head) {
    return rev(head, null);
  }

  public ListNode rev(ListNode node, ListNode pre) {
    if (node == null)
      return pre;
    ListNode temp = node.next;
    node.next = pre;
    return rev(temp, node);
  }
}
