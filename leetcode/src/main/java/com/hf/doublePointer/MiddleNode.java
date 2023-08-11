package com.hf.doublePointer;

import com.hf.base.ListNode;


/**
 * 寻找链表的中点
 */
public class MiddleNode {

    public static ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
