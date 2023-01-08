package com.aditya.LinkedList;

/**
 * This problem aims to find a cycle in the list and can be solved in many ways
 *
 * SOLUTION 1:
 * As you loop through LL keep storing the head ;if a head appears again in the storage during the traversal
 * which means a cycle is present.
 * Time Complexity O(N)
 * Space Complexity O(N) -> To store all the LL nodes
 *
 * SOLUTION 2:
 * Keep two pointers slow and fast and increment slow by one step and fast by two steps
 * During the traversal if the pointers coincide means a cycle is present
 * We can implement this both recursively and iteratively
 * Time Complexity for both is O(N)
 * Space Complexity is O(1) for iterative approach and O(N) for recursive due to stack space
 */
public class LinkedListCycle {

    static boolean isFirst=true;
    public static void main(String[] args) {
        ListNode head=new ListNode(7);
        ListNode last=head.next(new ListNode(7)).next(new ListNode(7)).next(new ListNode(9)).next(new ListNode(10));
        last.next=head;

        //returns the beginning of the cycle
        ListNode begin=hasCycle(head,head,isFirst);
        ListNode temp=begin;
        /**
         * For checking the solution head is correct or not
         */
        while(isFirst)
        {
            System.out.println(begin.val);
            begin=begin.next;
            if(begin==temp) break;
        }
    }
    public static ListNode hasCycle(ListNode slow,ListNode fast,boolean isFirst)
    {
        if(fast==null ||  fast.next==null) return null;

        if(fast==slow) return fast;

        return hasCycle(slow.next,fast.next.next,false);

    }
}
