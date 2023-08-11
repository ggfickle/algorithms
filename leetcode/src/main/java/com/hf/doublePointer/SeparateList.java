package com.hf.doublePointer;

import com.hf.base.ListNode;

public class SeparateList {

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
