package com.aditya.LinkedList;

/**
 * This problem aims at reordering list that is first Node points at last ,Now both left and right pointer incr/dec respectively and point to each other.
 * Example I/P -> 1->2->3->4
 *         O/P -> 1->4->2->3
 *
 * SOLUTION APPROACH
 * 1. We keep incrementing the head pointer until it becomes null and return when it is null which servers as a right pointer
 * 2. We keep a copy of head initially which will serve as a left pointer.
 * 3. On returning as per condition ,Ref: above example 4 will be returned and now first->head and head->first.next(2)
 * 4. This process is recursive in nature and continues until we reach the midsection which is when first.next==head ,Here our left pointer's next should point to head
 * 5. We keep a use of boolean to stop the recursion
 * 6. The problem is explained beautifully in this link -> (<a href="https://docs.google.com/presentation/d/e/2PACX-1vQ-Oy-oQ0i4CvWbo8gf9-v42gVOb5gS76sJvhG7jqIntQV7R1dDG3tS7YUhRiPqYXBCjqCcVsJUeZjG/pub?start=true&loop=false&delayms=1500&slide=id.gbc95359713_0_365">...</a>)
 * Time Complexity O(N)
 * Space Complexity O(N) -> Stack space
 *
 */
public class ReOrderLinkedList {

    static boolean stop=false;
    static ListNode first;
    static ListNode prev;
    public static void main(String[] args) {
        ListNode head=new ListNode(7);
        head.next(new ListNode(4)).next(new ListNode(6)).next(new ListNode(9)).next(new ListNode(10)).next(new ListNode(11));
        first=head;
        prev=first;
        reorder(head);
        while (null!=head) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static void reorder(ListNode head)
    {
        if(head==null ) return ;

        reorder(head.next);
        if(!stop)
        {
            ListNode next=first.next;
            first.next=head;
            head.next=next;
            first=next;
        }
        if(head==first.next)
        {
            first.next=null;
            stop=true;
        }
    }
}
