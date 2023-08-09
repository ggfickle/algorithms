package com.hf.doublePointer;

import com.hf.base.ListNode;

public class MergeList {

    public static void main(String[] args) {

        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode14 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode14;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode23 = new ListNode(3);
        ListNode listNode24 = new ListNode(4);
        listNode21.next = listNode23;
        listNode23.next = listNode24;

        ListNode listNode = mergeTwoLists(listNode11, listNode21);
        System.out.println(listNode);

    }

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
