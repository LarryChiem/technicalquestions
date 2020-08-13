//8.7 REMOVE THE /CTH LAST ELEMENT FROM A LIST
//        Without knowing the length of a linked list, it is not trivial to delete the /cth last
//        element in a singly linked list.
//        Given a singly linked list and an integer k, write a program to remove the /cth last
//        element from the list. Your algorithm cannot use more than a few words of storage,
//        regardless of the length of the list. In particular, you cannot assume that it is possible
//        to record the length of the list.
//        Hint: If you know the length of the list, can you find the /cth last node using two iterators?

public class removeKthLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast, slow, dummy = new ListNode(0);
        fast = dummy;
        slow = dummy;
        dummy.next = head;
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }
}
