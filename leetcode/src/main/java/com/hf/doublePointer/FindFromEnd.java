package com.hf.doublePointer;

import com.hf.base.ListNode;

/**
 * 寻找倒数第K个节点
 */
public class FindFromEnd {

    public ListNode findFromEnd(ListNode head, int k) {
        ListNode first = head;
        for (int i = 0; i < k; i++) {
            first = first.next;
        }
        ListNode second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
