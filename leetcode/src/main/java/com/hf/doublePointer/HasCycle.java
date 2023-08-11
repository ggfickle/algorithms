package com.hf.doublePointer;

import com.hf.base.ListNode;


/**
 * 判断链表是否存在环
 */
public class HasCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) {
                return true;
            }
        }
        return false;
    }
}
