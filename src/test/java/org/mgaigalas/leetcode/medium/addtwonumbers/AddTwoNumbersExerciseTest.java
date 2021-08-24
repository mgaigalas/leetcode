package org.mgaigalas.leetcode.medium.addtwonumbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Marius Gaigalas
 */
@Slf4j
class AddTwoNumbersExerciseTest {
    @Test
    void shouldAddTwoNumbers() {
        final var objectUnderTest = new AddTwoNumbersExercise();

        final var a1Node = new ListNode(9);
        final var a2Node = new ListNode(9, a1Node);
        final var a3Node = new ListNode(9, a2Node);
        final var a4Node = new ListNode(9, a3Node);
        final var a5Node = new ListNode(9, a4Node);
        final var a6Node = new ListNode(9, a5Node);
        final var a7Node = new ListNode(9, a6Node);

        final var b1Node = new ListNode(9);
        final var b2Node = new ListNode(9, b1Node);
        final var b3Node = new ListNode(9, b2Node);
        final var b4Node = new ListNode(9, b3Node);

        final var result = objectUnderTest.addTwoNumbers(a7Node, b4Node);
        log.info("result: {}", result);

        assertThat(result)
                .as("Should return: [8, 9, 9, 9, 0, 0, 0, 1]")
                .satisfies(node -> {
                    var digits = new int[]{8, 9, 9, 9, 0, 0, 0, 1};
                    var index = 0;
                    while (node.getNext() != null) {
                        var digit = digits[index++];
                        assertThat(node.getVal())
                                .as(format("index: %s => expected value: %s", index, digit))
                                .isEqualTo(digit);
                        node = node.getNext();
                    }
                });
    }
}