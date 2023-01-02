package com.aditya.linkedLists.mergeTwoSortedLists;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next(2).next(3).next(4);
        ListNode list2=new ListNode(1);
        list2.next(3).next(3).next(6);
        ListNode head=merge(list1,list2);
        printList(head);
    }
    public static void printList(ListNode head)
    {
        while(null!=head)
        {
            System.out.print(head.toString()+" ");
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
class ListNode
{
    int val;
    ListNode next;
    public ListNode(int val)
    {
        this.val=val;
    }
    public ListNode(int val,ListNode next)
    {
        this.val=val;
        this.next=next;
    }
    public ListNode next(int val)
    {
        ListNode node=new ListNode(val);
        this.next=node;
        return this.next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
