package com.aditya.LinkedList;

/**
 * This question aims to remove duplicates from a sorted list
 * To solve this we might have many approaches
 * APPROACH:
 * We don't want a head to stay in the LL where head.val==head.next.val(Condition of duplicate elements )so we keep hovering head until this condition is breached
 * I want to assign my curr.next to future recursion calls
 * Future recursion call will give me a suitable LL node which can be assigned to my curr.next
 * Base Condition is when my head becomes null or my head.next is null in this case head is returned
 * Example : 3->3, here my head will become null so just using head.next==null in base case won't work thus this extra condition
 * of head==null is put
 * Time Complexity is O(N)
 * Space Complexity is stack space which is O(N) too.
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(7);
        head.next(new ListNode(7)).next(new ListNode(7)).next(new ListNode(9)).next(new ListNode(10));

        ListNode pointer=removeDuplicates(head);
        while (null!=pointer) {
            System.out.println(pointer.val);
            pointer=pointer.next;
        }

    }
    public static ListNode removeDuplicates(ListNode head)
    {
        if(head==null  || head.next==null) return head;

        while(head.next!=null && head.val==head.next.val)
        {
            head=head.next;
        }
        head.next=removeDuplicates(head.next);
        return  head;
    }
}
