package com.hf.doublePointer;

import com.hf.base.ListNode;

public class SeparateList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2_1 = new ListNode(2);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode2_2 = new ListNode(2);
        listNode1.next = listNode4;
        listNode4.next = listNode3;
        listNode3.next = listNode2_1;
        listNode2_1.next = listNode5;
        listNode5.next = listNode2_2;
        System.out.println(partition(listNode1, 3));
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode ltNode = new ListNode(-1);
        ListNode gtNode = new ListNode(-1);

        ListNode ltLink = ltNode;
        ListNode gtLink = gtNode;

        while (head != null) {
            if (head.val < x) {
                ltLink.next = head;
                ltLink = ltLink.next;
            } else  {
                gtLink.next = head;
                gtLink = gtLink.next;
            }
            head = head.next;
        }
        ltLink.next = gtNode.next;
        gtLink.next = null;
        return ltNode.next;
    }
}
