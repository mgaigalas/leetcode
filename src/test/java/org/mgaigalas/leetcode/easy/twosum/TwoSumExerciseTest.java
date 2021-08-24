package org.mgaigalas.leetcode.easy.twosum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Marius Gaigalas
 */
@Slf4j
class TwoSumExerciseTest {
    @Test
    void shouldTestTwoSum() {
        final var objectUnderTest = new TwoSumExercise();
        final var result = objectUnderTest.twoSum(new int[]{3, 2, 4}, 6);
        log.info("result: {}", result);
        assertThat(result)
                .as("Should return: [1, 2]")
                .contains(1, 2);
    }
}