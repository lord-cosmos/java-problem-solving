package practice.LinkedList;

public class RemoveNthNode {
  public ListNode removeNthFromEnd(ListNode head, int n) {

    if (head == null || head.next == null)
      return null;

    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode first = temp, second = temp;

    while (n > 0) {
      second = second.next;
      n--;
    }

    while (second.next != null) {
      second = second.next;
      first = first.next;
    }
    // below, line is a bug.
    // first.next = second;

    // We just a pointer which is before the node,we wanted to remove. That's it.
    // to get that pointer, we use second and first and follow the algo
    // at the end, first will be pointing to node before the NodeToBeDeleted
    // and second will be at the last node.

    // so we do this ,
    // next element should next element's next
    first.next = first.next.next;

    return head;
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

    RemoveNthNode re = new RemoveNthNode();
    ListNode returnHead = re.removeNthFromEnd(head, 2);
    while (returnHead != null) {
      System.out.println(returnHead.val + " --> ");
      returnHead = returnHead.next;
    }
  }
}
