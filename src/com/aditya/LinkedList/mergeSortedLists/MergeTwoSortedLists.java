package com.aditya.LinkedList.mergeSortedLists;

import com.aditya.LinkedList.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * This problem aims at merging two linked Lists provided their heads in a sorted manner
 * RECURSIVE THINKING:
 * We check the lesser value amongst pointers and  call the next  recur with the next pointer of the lesser payload
 * So the pointer slides on the LL which had <= value
 * Now when the function returns to this instance after recursion finishes we need to assign curr.next to something
 * We can store the lesser pointer at each stage and return it at the end which would server as a ref to prev pointer.
 * Base Condition when either pointer becomes null just return the other pointer it will get appended as is to the prev link
 * Time Complexity O(M+N)
 * Space Complexity O(M+N)
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next(new ListNode(2));
        ListNode list2=new ListNode(3);
        list2.next(new ListNode(5));
        ListNode head=merge(list1,list2);
        printList(head);
    }
    public static void printList(ListNode head)
    {
        while(null!=head)
        {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static ListNode merge(ListNode list1,ListNode list2)
    {
        if(list1==null) return list2;

        if(list2==null) return list1;

        ListNode current;
        if(list1.val<=list2.val)
        {
            current=list1;
            current.next=merge(list1.next,list2);
        }
        else
        {
            current=list2;
            current.next=merge(list1,list2.next);
        }
        return current;
    }

}

