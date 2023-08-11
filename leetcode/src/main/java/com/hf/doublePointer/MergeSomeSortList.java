package com.hf.doublePointer;

import com.hf.base.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 合并K个有序列表
 */
public class MergeSomeSortList {

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode listNode : lists) {
            if (listNode != null) {
                priorityQueue.add(listNode);
            }
        }

        ListNode listNode = new ListNode(-1);
        ListNode prev = listNode;
        while (!priorityQueue.isEmpty()) {
            ListNode poll = priorityQueue.poll();
            prev.next = poll;
            prev = prev.next;
            if (poll.next != null) {
                priorityQueue.add(poll.next);
            }
        }
        return listNode.next;
    }
}
