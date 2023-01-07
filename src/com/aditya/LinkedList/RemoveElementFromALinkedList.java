package com.aditya.LinkedList;

/**
 * This question aims at removing all elements==target from the source linkedList
 * Rule for Removing: If the current ele==target then prevEle.next =current.next this way link of the curr ele is removed by poiting
 * rev ele to current's next
 * In recursive thinking putting the above situation
 * 1. The current method will ask recursion to give an ele when the current.next should point
 * 2. Now the recursion method will check for the  curr.next.val==target
 * i. If the condition is true it will return the current.next.next and the curr.next will be removed from the link
 * ii. If not true then it will return curr.next only because this node  deserves to stay in the link :)
 * Time Complexity=O(N)
 * Space Complexity= O(N)
 */
public class RemoveElementFromALinkedList {

    public static void main(String[] args) {
        ListNode head=new ListNode(7);
        head.next(new ListNode(7)).next(new ListNode(6)).next(new ListNode(8)).next(new ListNode(7));

        System.out.println(removeElementsFromLinkedList(head,7));
    }
    public  static ListNode removeElementsFromLinkedList(ListNode head,int target)
    {
        if(head==null) return null;

        head.next=removeElementsFromLinkedList(head.next,target);

        return  head.val==target?head.next:head;
    }
}


