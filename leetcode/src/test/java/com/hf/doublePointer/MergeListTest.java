package com.hf.doublePointer;

import com.hf.base.ListNode;

class MergeListTest {

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

        ListNode listNode = MergeList.mergeTwoLists(listNode11, listNode21);
        System.out.println(listNode);
    }

}