package org.mgaigalas.leetcode.medium.addtwonumbers;

import lombok.Data;

/**
 * @author Marius Gaigalas
 */
@Data
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
