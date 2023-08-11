package com.hf.doublePointer;


import com.hf.base.ListNode;

class MiddleNodeTest {

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
        ListNode listNode = MiddleNode.middleNode(listNode1);
        System.out.println(listNode);
        System.out.println(listNode.val);
    }

}