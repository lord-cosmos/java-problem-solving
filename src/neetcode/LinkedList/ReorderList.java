package neetcode.LinkedList;

// import java.util.List;

public class ReorderList {

  public void reorderList(ListNode head) {

    // my initial solution.

    ListNode start = head;
    ListNode tail, l, r;
    tail = head;
    l = head;
    r = head;

    int count = 0;

    while (start.next != null) {
      start = start.next;
      while (tail.next.next != null)
        tail = tail.next;
      while (r.next != null) {
        r = r.next;
      }

      if (tail != l && start != r) {
        tail.next = null;
      }
      l.next = r;

      if (r != start) {
        r.next = start;
      }

      l = start;
      r = start;
      tail = start;

    }

  }

  public void reorderList2(ListNode head) {
    // more effecient solution :
    ListNode slow = head;
    ListNode fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode second = slow.next;
    ListNode prev = slow.next = null;
    while (second != null) {
      ListNode tmp = second.next;
      second.next = prev;
      prev = second;
      second = tmp;
    }

    ListNode first = head;
    second = prev;

    while (second != null) {
      ListNode tmp1 = first.next;
      ListNode tmp2 = second.next;
      first.next = second;
      second.next = tmp1;
      first = tmp1;
      second = tmp2;
    }
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode head = node1;

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    // node5.next = null;
    ReorderList re = new ReorderList();
    re.reorderList2(head);
    // // // int count = 0;
    // while (head != null) {
    // System.out.println(head.val + " --> ");
    // head = head.next;

    // }

  }
}
