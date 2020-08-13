public class ListNode<I extends Number> {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode<Number> next) { this.val = val; this.next = next; }
}
