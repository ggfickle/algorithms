package com.hf.doublePointer;

import com.hf.base.ListNode;

/**
 * 移除倒数的第n位的节点，并且返回移除后的节点值
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(-1);
        listNode.next = head;

        ListNode first = listNode;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        ListNode second = listNode;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head.next;
    }
}
