package org.mgaigalas.leetcode.medium.addtwonumbers;

/**
 * @author Marius Gaigalas
 */
public class AddTwoNumbersExercise {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final var sum = number(l1).add(number(l2));
        return toListNode(sum);
    }

    private java.math.BigInteger number(ListNode node) {
        var digitSb = new StringBuilder();
        while (node != null) {
            digitSb.append(node.getVal());
            node = node.getNext();
        }
        return new java.math.BigInteger(digitSb.reverse().toString());
    }

    private ListNode toListNode(java.math.BigInteger number) {
        char[] digits = String.valueOf(number).toCharArray();
        ListNode node = new ListNode(toInt(digits[0]));
        if (digits.length == 1) {
            return node;
        }

        for (int i = 1; i < digits.length; i++) {
            node = new ListNode(toInt(digits[i]), node);
        }
        return node;
    }

    private int toInt(char digit) {
        return Integer.parseUnsignedInt(String.valueOf(digit));
    }
}
