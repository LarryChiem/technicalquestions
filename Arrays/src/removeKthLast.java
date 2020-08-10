//8.7 REMOVE THE /CTH LAST ELEMENT FROM A LIST
//        Without knowing the length of a linked list, it is not trivial to delete the /cth last
//        element in a singly linked list.
//        Given a singly linked list and an integer k, write a program to remove the /cth last
//        element from the list. Your algorithm cannot use more than a few words of storage,
//        regardless of the length of the list. In particular, you cannot assume that it is possible
//        to record the length of the list.
//        Hint: If you know the length of the list, can you find the /cth last node using two iterators?

public class removeKthLast {
    public static ListNode<Integer> removeKthLast(ListNode <Integer> L, int k) {
        ListNode<Integer> dummyHead = new ListNode<>(0, L);
        ListNode<Integer> first = dummyHead.next;

        while (k-- > 0) {
            first = first.next;
        }

        ListNode<Integer> second = dummyHead;
        while (first != null) {
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;
        return dummyHead.next;


    }
}
