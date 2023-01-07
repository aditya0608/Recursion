package com.aditya.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}



    public ListNode (int val) {this.val = val;
    }
    public ListNode next(ListNode node)
    {
        this.next=node;
        return node;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                " ,next= "+next+
                '}';
    }
}