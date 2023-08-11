package com.hf.doublePointer;

import com.hf.base.ListNode;

public class MergeList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(-1);
        ListNode prev = listNode;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                prev.next = list2;
                list2 = list2.next;
            } else {
                prev.next = list1;
                list1 = list1.next;
            }
            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;
        return listNode.next;
    }
}
