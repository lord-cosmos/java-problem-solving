package practice.LinkedList;

public class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow)
        return true;

    }
    return false;
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(4);
    // ListNode node5 = new ListNode(5);
    ListNode head = node1;

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;

    LinkedListCycle le = new LinkedListCycle();
    System.out.println(le.hasCycle(head));
  }
}
